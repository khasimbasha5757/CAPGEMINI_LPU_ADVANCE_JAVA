package com.CaseStudy1Service;

import com.CaseStudy1.Payment;
import com.CaseStudy1.Profile;
import com.CaseStudy1.PurchaseOrder;
import com.CaseStudy1.User;
import com.CaseStudy1DAO.OrderDAO;
import com.CaseStudy1DAO.PaymentDAO;
import com.CaseStudy1DAO.ProfileDAO;
import com.CaseStudy1DAO.UserDAO;

import jakarta.persistence.EntityManager;

public class ECommerceService {

    private UserDAO userDAO = new UserDAO();
    private OrderDAO orderDAO = new OrderDAO();
    private PaymentDAO paymentDAO = new PaymentDAO();
    private ProfileDAO profileDAO = new ProfileDAO();

    public void saveProfile(Profile profile) {
        profileDAO.saveProfile(profile);
    }

    public void saveOrder(PurchaseOrder order) {
        orderDAO.saveOrder(order);
    }

    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    public void savePayment(Payment payment) {
        paymentDAO.savePayment(payment);
    }
}
