package com.ltts.restaurant.Restaurantapplication.Controller;

import com.ltts.restaurant.Restaurantapplication.Model.Item;
import com.ltts.restaurant.Restaurantapplication.Model.Member;
import com.ltts.restaurant.Restaurantapplication.Model.Order;
import com.ltts.restaurant.Restaurantapplication.bo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    MemberBO mb;

    @Autowired
    ItemBO ib;

    @Autowired
    ItemInterface ie;

    @Autowired
    orderBO ob;

    public String M1() {
        return "welcome";
    }

    @RequestMapping("/")

    public ModelAndView m2() {
        return new ModelAndView("Index");
    }

    @RequestMapping("/register")
    public ModelAndView m3() {
        return new ModelAndView("register");
    }

    @RequestMapping(value = "insertuser", method = RequestMethod.POST)
    public ModelAndView m4(HttpServletRequest req) {
        ModelAndView mv = null;
        String email = req.getParameter("useremail");
        String phone = req.getParameter("userphone");
        String name = req.getParameter("username");
        Member m = new Member(email, phone, name);

        mb.save(m);
        mv = new ModelAndView("Success");
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView m5() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "checkuser", method = RequestMethod.POST)
    public ModelAndView m6(HttpServletRequest req) {
        ModelAndView mv = null;

        String email = req.getParameter("useremail");
        String pass = req.getParameter("userphone");
        System.out.println(email + " " + pass);
        Member m = mb.getById(email);
        System.out.println(m);
        if (m == null) {
            mv = new ModelAndView("login");
        } else {
            if (m.getEmail().equals(email)) {
                if (m.getPhone().equals(pass)) {
                    mv = new ModelAndView("welcome");
                } else {
                    mv = new ModelAndView("error");
                }

            } else {
                mv = new ModelAndView("error");
            }
        }

        return mv;
    }

    @RequestMapping("additem")
    public ModelAndView m7() {
        return new ModelAndView("additem");
    }

    @RequestMapping(value = "insertitem", method = RequestMethod.POST)
    public ModelAndView m8(HttpServletRequest req) {
        ModelAndView mv = null;
        String name = req.getParameter("iname");
        String spice = req.getParameter("spice");
        String price = req.getParameter("price");
        //double price=req.getParameter(null);
        Item m = new Item(0, name, price, spice, LocalDate.now(), LocalTime.now());
        boolean b = ib.insertItem(m);
        if (b == false) {
            mv = new ModelAndView("welcome");
        } else {
            mv = new ModelAndView("error");
        }
        return mv;
    }

    @RequestMapping("viewallitems")
    public ModelAndView m9(Model model) {
        ModelAndView mv = null;
        List<Item> li = ib.getAllItems();
        System.out.println(li);
        model.addAttribute("item", li);
        return new ModelAndView("viewallitems");
    }

    @RequestMapping(value = "updateitem")
    public ModelAndView m11(HttpServletRequest req, Model model, @RequestParam int id) {
        Item m = ie.getById(id);
        System.out.println(m);
        model.addAttribute("item", m);
        return new ModelAndView("updateitem");

    }

    @RequestMapping(value = "updateitem", method = RequestMethod.POST)
    public ModelAndView m12(HttpServletRequest req) {
        ModelAndView mv = null;
        int id = Integer.parseInt(req.getParameter("itemid"));
        String name = req.getParameter("itemname");
        String price = req.getParameter("price");
        String spice = req.getParameter("spice");
        System.out.println("Inside update");
        Item m = new Item(id, name, price, null, null, null);
        boolean b = ib.updateItem(m);
        if (b == false) {
            mv = new ModelAndView("welcome");
        } else {
            mv = new ModelAndView("error");
        }
        return mv;
    }

    @RequestMapping(value = "/purchase", method = RequestMethod.GET)
    public ModelAndView m13(Model model) {
        List<Item> li = ib.getAllItems();
        model.addAttribute("item", li);
        Order order = new Order();
        model.addAttribute("order", order);

        return new ModelAndView("purchase");
    }

    @RequestMapping(value = "purchaseitem", method = RequestMethod.GET)
    public ModelAndView m14(HttpServletRequest req, Model model) {
        String id = req.getParameter("id");
        Item item = ie.getById(Integer.parseInt(id));
        model.addAttribute("item", item);
        Order order = new Order();
        order.setItemName(item.getItemName());
        order.setDate(LocalDate.now());
        order.setTime(LocalTime.now());
        order.setPrice(item.getPrice());
        Integer itemPrice = Integer.parseInt(item.getPrice());
        double total = (0.01 * itemPrice) + itemPrice;
        order.setTotal(total + "");
        order.setNumOfMeals(1);
        model.addAttribute("order", order);
        return new ModelAndView("checkout");
    }


    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    public ModelAndView m15(HttpServletRequest req, Model model) {
        String itemName = req.getParameter("itemName");
        String date = req.getParameter("date");
        LocalDate localDate = LocalDate.parse(date);

        LocalTime localTime = LocalTime.now();

        String price = req.getParameter("price");
        String numOfMeals = req.getParameter("numOfMeals");
        Integer totalMeals = Integer.parseInt(numOfMeals);


        Integer itemPrice = Integer.parseInt(price);
        double totalPrice = (totalMeals * itemPrice);
        double tax = 0.1 * totalPrice;
        totalPrice = tax + totalPrice;

        String paymentType = req.getParameter("paymentType");

        Order order = new Order(itemName, localDate, localTime, price, totalPrice + "", paymentType, totalMeals);
        orderRepository.save(order);
        model.addAttribute("order", order);
        return new ModelAndView("ordersuccessful");
    }

}
