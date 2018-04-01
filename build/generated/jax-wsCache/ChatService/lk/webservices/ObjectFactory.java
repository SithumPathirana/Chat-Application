
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

    private final static QName _ShowChatsResponse_QNAME = new QName("http://webservices.lk/", "showChatsResponse");
    private final static QName _AddMessage_QNAME = new QName("http://webservices.lk/", "addMessage");
    private final static QName _CheckTitleResponse_QNAME = new QName("http://webservices.lk/", "checkTitleResponse");
    private final static QName _GetThreadDataResponse_QNAME = new QName("http://webservices.lk/", "getThreadDataResponse");
    private final static QName _CheckTitle_QNAME = new QName("http://webservices.lk/", "checkTitle");
    private final static QName _CreateThraed_QNAME = new QName("http://webservices.lk/", "createThraed");
    private final static QName _Hello_QNAME = new QName("http://webservices.lk/", "hello");
    private final static QName _UpdateTable_QNAME = new QName("http://webservices.lk/", "updateTable");
    private final static QName _HelloResponse_QNAME = new QName("http://webservices.lk/", "helloResponse");
    private final static QName _ShowChats_QNAME = new QName("http://webservices.lk/", "showChats");
    private final static QName _GetThreadData_QNAME = new QName("http://webservices.lk/", "getThreadData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lk.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetThreadData }
     * 
     */
    public GetThreadData createGetThreadData() {
        return new GetThreadData();
    }

    /**
     * Create an instance of {@link ShowChats }
     * 
     */
    public ShowChats createShowChats() {
        return new ShowChats();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CheckTitle }
     * 
     */
    public CheckTitle createCheckTitle() {
        return new CheckTitle();
    }

    /**
     * Create an instance of {@link CreateThraed }
     * 
     */
    public CreateThraed createCreateThraed() {
        return new CreateThraed();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link UpdateTable }
     * 
     */
    public UpdateTable createUpdateTable() {
        return new UpdateTable();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link CheckTitleResponse }
     * 
     */
    public CheckTitleResponse createCheckTitleResponse() {
        return new CheckTitleResponse();
    }

    /**
     * Create an instance of {@link GetThreadDataResponse }
     * 
     */
    public GetThreadDataResponse createGetThreadDataResponse() {
        return new GetThreadDataResponse();
    }

    /**
     * Create an instance of {@link ShowChatsResponse }
     * 
     */
    public ShowChatsResponse createShowChatsResponse() {
        return new ShowChatsResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link ChatThread }
     * 
     */
    public ChatThread createChatThread() {
        return new ChatThread();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowChatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "showChatsResponse")
    public JAXBElement<ShowChatsResponse> createShowChatsResponse(ShowChatsResponse value) {
        return new JAXBElement<ShowChatsResponse>(_ShowChatsResponse_QNAME, ShowChatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "checkTitleResponse")
    public JAXBElement<CheckTitleResponse> createCheckTitleResponse(CheckTitleResponse value) {
        return new JAXBElement<CheckTitleResponse>(_CheckTitleResponse_QNAME, CheckTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "getThreadDataResponse")
    public JAXBElement<GetThreadDataResponse> createGetThreadDataResponse(GetThreadDataResponse value) {
        return new JAXBElement<GetThreadDataResponse>(_GetThreadDataResponse_QNAME, GetThreadDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "checkTitle")
    public JAXBElement<CheckTitle> createCheckTitle(CheckTitle value) {
        return new JAXBElement<CheckTitle>(_CheckTitle_QNAME, CheckTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThraed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "createThraed")
    public JAXBElement<CreateThraed> createCreateThraed(CreateThraed value) {
        return new JAXBElement<CreateThraed>(_CreateThraed_QNAME, CreateThraed.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "updateTable")
    public JAXBElement<UpdateTable> createUpdateTable(UpdateTable value) {
        return new JAXBElement<UpdateTable>(_UpdateTable_QNAME, UpdateTable.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowChats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "showChats")
    public JAXBElement<ShowChats> createShowChats(ShowChats value) {
        return new JAXBElement<ShowChats>(_ShowChats_QNAME, ShowChats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lk/", name = "getThreadData")
    public JAXBElement<GetThreadData> createGetThreadData(GetThreadData value) {
        return new JAXBElement<GetThreadData>(_GetThreadData_QNAME, GetThreadData.class, null, value);
    }

}
