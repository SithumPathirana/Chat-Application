
package lk.webservices;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ChatService", targetNamespace = "http://webservices.lk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ChatService {


    /**
     * 
     * @param author
     * @param lastEdited
     * @param title
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createThraed", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CreateThraed")
    @Action(input = "http://webservices.lk/ChatService/createThraed")
    public void createThraed(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "author", targetNamespace = "")
        String author,
        @WebParam(name = "lastEdited", targetNamespace = "")
        String lastEdited);

    /**
     * 
     * @param title
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkTitle", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CheckTitle")
    @ResponseWrapper(localName = "checkTitleResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CheckTitleResponse")
    @Action(input = "http://webservices.lk/ChatService/checkTitleRequest", output = "http://webservices.lk/ChatService/checkTitleResponse")
    public boolean checkTitle(
        @WebParam(name = "title", targetNamespace = "")
        String title);

    /**
     * 
     * @param lastEdited
     * @param title
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "updateTable", targetNamespace = "http://webservices.lk/", className = "lk.webservices.UpdateTable")
    @Action(input = "http://webservices.lk/ChatService/updateTable")
    public void updateTable(
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "lastEdited", targetNamespace = "")
        String lastEdited);

    /**
     * 
     * @param sender
     * @param lastEdited
     * @param title
     * @param messageContent
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addMessage", targetNamespace = "http://webservices.lk/", className = "lk.webservices.AddMessage")
    @Action(input = "http://webservices.lk/ChatService/addMessage")
    public void addMessage(
        @WebParam(name = "messageContent", targetNamespace = "")
        String messageContent,
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "sender", targetNamespace = "")
        String sender,
        @WebParam(name = "lastEdited", targetNamespace = "")
        String lastEdited);

    /**
     * 
     * @return
     *     returns java.util.List<lk.webservices.ChatThread>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getThreadData", targetNamespace = "http://webservices.lk/", className = "lk.webservices.GetThreadData")
    @ResponseWrapper(localName = "getThreadDataResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.GetThreadDataResponse")
    @Action(input = "http://webservices.lk/ChatService/getThreadDataRequest", output = "http://webservices.lk/ChatService/getThreadDataResponse")
    public List<ChatThread> getThreadData();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://webservices.lk/", className = "lk.webservices.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.HelloResponse")
    @Action(input = "http://webservices.lk/ChatService/helloRequest", output = "http://webservices.lk/ChatService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param chatTitle
     * @return
     *     returns java.util.List<lk.webservices.Message>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showChats", targetNamespace = "http://webservices.lk/", className = "lk.webservices.ShowChats")
    @ResponseWrapper(localName = "showChatsResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.ShowChatsResponse")
    @Action(input = "http://webservices.lk/ChatService/showChatsRequest", output = "http://webservices.lk/ChatService/showChatsResponse")
    public List<Message> showChats(
        @WebParam(name = "chatTitle", targetNamespace = "")
        String chatTitle);

}