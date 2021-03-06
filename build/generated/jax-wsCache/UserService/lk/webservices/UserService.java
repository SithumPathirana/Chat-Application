
package lk.webservices;

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
@WebService(name = "UserService", targetNamespace = "http://webservices.lk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param password
     * @param rePassword
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://webservices.lk/", className = "lk.webservices.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.RegisterResponse")
    @Action(input = "http://webservices.lk/UserService/registerRequest", output = "http://webservices.lk/UserService/registerResponse")
    public boolean register(
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "re_password", targetNamespace = "")
        String rePassword);

    /**
     * 
     * @param password
     * @param loginId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkUser", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CheckUser")
    @ResponseWrapper(localName = "checkUserResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CheckUserResponse")
    @Action(input = "http://webservices.lk/UserService/checkUserRequest", output = "http://webservices.lk/UserService/checkUserResponse")
    public boolean checkUser(
        @WebParam(name = "loginId", targetNamespace = "")
        String loginId,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param loginId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkLoginId", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CheckLoginId")
    @ResponseWrapper(localName = "checkLoginIdResponse", targetNamespace = "http://webservices.lk/", className = "lk.webservices.CheckLoginIdResponse")
    @Action(input = "http://webservices.lk/UserService/checkLoginIdRequest", output = "http://webservices.lk/UserService/checkLoginIdResponse")
    public boolean checkLoginId(
        @WebParam(name = "loginId", targetNamespace = "")
        String loginId);

    /**
     * 
     * @param password
     * @param loginId
     * @param nickname
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "insertUser", targetNamespace = "http://webservices.lk/", className = "lk.webservices.InsertUser")
    @Action(input = "http://webservices.lk/UserService/insertUser")
    public void insertUser(
        @WebParam(name = "nickname", targetNamespace = "")
        String nickname,
        @WebParam(name = "loginId", targetNamespace = "")
        String loginId,
        @WebParam(name = "password", targetNamespace = "")
        String password);

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
    @Action(input = "http://webservices.lk/UserService/helloRequest", output = "http://webservices.lk/UserService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
