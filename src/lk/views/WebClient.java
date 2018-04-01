/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.views;

/**
 *
 * @author DELL
 */
public class WebClient {

    public static boolean register(java.lang.String password, java.lang.String rePassword) {
        lk.webservices.UserService_Service service = new lk.webservices.UserService_Service();
        lk.webservices.UserService port = service.getUserServicePort();
        return port.register(password, rePassword);
    }

    public static boolean checkLoginId(java.lang.String loginId) {
        lk.webservices.UserService_Service service = new lk.webservices.UserService_Service();
        lk.webservices.UserService port = service.getUserServicePort();
        return port.checkLoginId(loginId);
    }

    public static void insertUser(java.lang.String nickname, java.lang.String loginId, java.lang.String password) {
        lk.webservices.UserService_Service service = new lk.webservices.UserService_Service();
        lk.webservices.UserService port = service.getUserServicePort();
        port.insertUser(nickname, loginId, password);
    }

    public static boolean checkUser(java.lang.String loginId, java.lang.String password) {
        lk.webservices.UserService_Service service = new lk.webservices.UserService_Service();
        lk.webservices.UserService port = service.getUserServicePort();
        return port.checkUser(loginId, password);
    }

    public static void createThraed(java.lang.String title, java.lang.String author, java.lang.String lastEdited) {
        lk.webservices.ChatService_Service service = new lk.webservices.ChatService_Service();
        lk.webservices.ChatService port = service.getChatServicePort();
        port.createThraed(title, author, lastEdited);
    }

    public static void addMessage(java.lang.String messageContent, java.lang.String title, java.lang.String sender, java.lang.String lastEdited) {
        lk.webservices.ChatService_Service service = new lk.webservices.ChatService_Service();
        lk.webservices.ChatService port = service.getChatServicePort();
        port.addMessage(messageContent, title, sender, lastEdited);
    }

    public static boolean checkTitle(java.lang.String title) {
        lk.webservices.ChatService_Service service = new lk.webservices.ChatService_Service();
        lk.webservices.ChatService port = service.getChatServicePort();
        return port.checkTitle(title);
    }

    public static void updateTable(java.lang.String title, java.lang.String lastEdited) {
        lk.webservices.ChatService_Service service = new lk.webservices.ChatService_Service();
        lk.webservices.ChatService port = service.getChatServicePort();
        port.updateTable(title, lastEdited);
    }

//   

    public static java.util.List<lk.webservices.ChatThread> getThreadData() {
        lk.webservices.ChatService_Service service = new lk.webservices.ChatService_Service();
        lk.webservices.ChatService port = service.getChatServicePort();
        return port.getThreadData();
    }

    public static java.util.List<lk.webservices.Message> showChats(java.lang.String chatTitle) {
        lk.webservices.ChatService_Service service = new lk.webservices.ChatService_Service();
        lk.webservices.ChatService port = service.getChatServicePort();
        return port.showChats(chatTitle);
    }

   
  
    


    
    
    
    
    
    
    
    
    
}
