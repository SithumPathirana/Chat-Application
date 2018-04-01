
package lk.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lk.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckUserResponse_QNAME = new QName("http://webservices.lk/", "checkUserResponse");
    private final static QName _Register_QNAME = new QName("http://webservices.lk/", "register");
    private final static QName _Hello_QNAME = new QName("http://webservices.lk/", "hello");
    private final static QName _CheckLoginIdResponse_QNAME = new QName("http://webservices.lk/", "checkLoginIdResponse");
    private final static QName _CheckLoginId_QNAME = new QName("http://webservices.lk/", "checkLoginId");
    private final static QName _HelloResponse_QNAME = new QName("http://webservices.lk/", "helloResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://webservices.lk/", "registerResponse");
    private final static QName _CheckUser_QNAME = new QName("http://webservices.lk/", "checkUser");
    private final static QName _InsertUser_QNAME = new QName("http://webservices.lk/", "insertUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lk.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckUser }
     * 
     */
    public CheckUser createCheckUser() {
        return new CheckUser();
    }

    /**
     * Create an instance of {@link InsertUser }
     * 
     */
    public InsertUser createInsertUser() {
        return new InsertUser();
    }

    /**
     * Create an instance of {@link CheckLoginIdResponse }
     * 
     */
    public CheckLoginIdResponse createCheckLoginIdResponse() {
        return new CheckLoginIdResponse();
    }

    /**
     * Create an instance of {@link CheckLoginId }
     * 
     */
    public CheckLoginId createCheckLoginId() {
        return new CheckLoginId();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CheckUserResponse }
     * 
     */
    public CheckUserResponse createCheckUserResponse() {
        return new CheckUserResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "checkUserResponse")
    public JAXBElement<CheckUserResponse> createCheckUserResponse(CheckUserResponse value) {
        return new JAXBElement<CheckUserResponse>(_CheckUserResponse_QNAME, CheckUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "checkLoginIdResponse")
    public JAXBElement<CheckLoginIdResponse> createCheckLoginIdResponse(CheckLoginIdResponse value) {
        return new JAXBElement<CheckLoginIdResponse>(_CheckLoginIdResponse_QNAME, CheckLoginIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "checkLoginId")
    public JAXBElement<CheckLoginId> createCheckLoginId(CheckLoginId value) {
        return new JAXBElement<CheckLoginId>(_CheckLoginId_QNAME, CheckLoginId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "checkUser")
    public JAXBElement<CheckUser> createCheckUser(CheckUser value) {
        return new JAXBElement<CheckUser>(_CheckUser_QNAME, CheckUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "insertUser")
    public JAXBElement<InsertUser> createInsertUser(InsertUser value) {
        return new JAXBElement<InsertUser>(_InsertUser_QNAME, InsertUser.class, null, value);
    }

}
