
package org.bellatrix.services.ws.accounts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.bellatrix.services.ws.accounts package. 
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

    private final static QName _CreateAccount_QNAME = new QName("http://services.bellatrix.org/", "createAccount");
    private final static QName _LoadAccountsByGroups_QNAME = new QName("http://services.bellatrix.org/", "loadAccountsByGroups");
    private final static QName _LoadBalanceInquiryResponse_QNAME = new QName("http://services.bellatrix.org/", "loadBalanceInquiryResponse");
    private final static QName _CreateCurrency_QNAME = new QName("http://services.bellatrix.org/", "createCurrency");
    private final static QName _LoadAccountsByID_QNAME = new QName("http://services.bellatrix.org/", "loadAccountsByID");
    private final static QName _LoadCurrencyResponse_QNAME = new QName("http://services.bellatrix.org/", "loadCurrencyResponse");
    private final static QName _LoadAccountPermissionsByID_QNAME = new QName("http://services.bellatrix.org/", "loadAccountPermissionsByID");
    private final static QName _LoadAccountPermissionsByIDResponse_QNAME = new QName("http://services.bellatrix.org/", "loadAccountPermissionsByIDResponse");
    private final static QName _LoadAccounts_QNAME = new QName("http://services.bellatrix.org/", "loadAccounts");
    private final static QName _LoadAccountPermissionsByAccountResponse_QNAME = new QName("http://services.bellatrix.org/", "loadAccountPermissionsByAccountResponse");
    private final static QName _UpdateAccount_QNAME = new QName("http://services.bellatrix.org/", "updateAccount");
    private final static QName _UpdateAccountPermission_QNAME = new QName("http://services.bellatrix.org/", "updateAccountPermission");
    private final static QName _LoadAllAccounts_QNAME = new QName("http://services.bellatrix.org/", "loadAllAccounts");
    private final static QName _CreateAccountPermission_QNAME = new QName("http://services.bellatrix.org/", "createAccountPermission");
    private final static QName _LoadCurrency_QNAME = new QName("http://services.bellatrix.org/", "loadCurrency");
    private final static QName _HeaderAuth_QNAME = new QName("http://services.bellatrix.org/", "headerAuth");
    private final static QName _LoadAccountsResponse_QNAME = new QName("http://services.bellatrix.org/", "loadAccountsResponse");
    private final static QName _LoadTransactionHistoryResponse_QNAME = new QName("http://services.bellatrix.org/", "loadTransactionHistoryResponse");
    private final static QName _LoadAccountsByIDResponse_QNAME = new QName("http://services.bellatrix.org/", "loadAccountsByIDResponse");
    private final static QName _DeleteAccountPermission_QNAME = new QName("http://services.bellatrix.org/", "deleteAccountPermission");
    private final static QName _LoadAccountPermissionsByAccount_QNAME = new QName("http://services.bellatrix.org/", "loadAccountPermissionsByAccount");
    private final static QName _TransactionException_QNAME = new QName("http://services.bellatrix.org/", "TransactionException");
    private final static QName _LoadAllAccountsResponse_QNAME = new QName("http://services.bellatrix.org/", "loadAllAccountsResponse");
    private final static QName _UpdateCurrency_QNAME = new QName("http://services.bellatrix.org/", "updateCurrency");
    private final static QName _LoadTransactionHistory_QNAME = new QName("http://services.bellatrix.org/", "loadTransactionHistory");
    private final static QName _LoadAccountsByGroupsResponse_QNAME = new QName("http://services.bellatrix.org/", "loadAccountsByGroupsResponse");
    private final static QName _LoadBalanceInquiry_QNAME = new QName("http://services.bellatrix.org/", "loadBalanceInquiry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.bellatrix.services.ws.accounts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadAccountsByGroupsRequest }
     * 
     */
    public LoadAccountsByGroupsRequest createLoadAccountsByGroupsRequest() {
        return new LoadAccountsByGroupsRequest();
    }

    /**
     * Create an instance of {@link AccountsPermissionRequest }
     * 
     */
    public AccountsPermissionRequest createAccountsPermissionRequest() {
        return new AccountsPermissionRequest();
    }

    /**
     * Create an instance of {@link Billers }
     * 
     */
    public Billers createBillers() {
        return new Billers();
    }

    /**
     * Create an instance of {@link Groups }
     * 
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link ResponseStatus }
     * 
     */
    public ResponseStatus createResponseStatus() {
        return new ResponseStatus();
    }

    /**
     * Create an instance of {@link PaymentFields }
     * 
     */
    public PaymentFields createPaymentFields() {
        return new PaymentFields();
    }

    /**
     * Create an instance of {@link TransactionHistoryResponse }
     * 
     */
    public TransactionHistoryResponse createTransactionHistoryResponse() {
        return new TransactionHistoryResponse();
    }

    /**
     * Create an instance of {@link ExternalMemberFields }
     * 
     */
    public ExternalMemberFields createExternalMemberFields() {
        return new ExternalMemberFields();
    }

    /**
     * Create an instance of {@link MemberFields }
     * 
     */
    public MemberFields createMemberFields() {
        return new MemberFields();
    }

    /**
     * Create an instance of {@link Members }
     * 
     */
    public Members createMembers() {
        return new Members();
    }

    /**
     * Create an instance of {@link LoadAccountsByIDRequest }
     * 
     */
    public LoadAccountsByIDRequest createLoadAccountsByIDRequest() {
        return new LoadAccountsByIDRequest();
    }

    /**
     * Create an instance of {@link TransactionHistoryRequest }
     * 
     */
    public TransactionHistoryRequest createTransactionHistoryRequest() {
        return new TransactionHistoryRequest();
    }

    /**
     * Create an instance of {@link LoadAccountsResponse }
     * 
     */
    public LoadAccountsResponse createLoadAccountsResponse() {
        return new LoadAccountsResponse();
    }

    /**
     * Create an instance of {@link AccountPermissions }
     * 
     */
    public AccountPermissions createAccountPermissions() {
        return new AccountPermissions();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link BalanceInquiryResponse }
     * 
     */
    public BalanceInquiryResponse createBalanceInquiryResponse() {
        return new BalanceInquiryResponse();
    }

    /**
     * Create an instance of {@link TransferTypeFields }
     * 
     */
    public TransferTypeFields createTransferTypeFields() {
        return new TransferTypeFields();
    }

    /**
     * Create an instance of {@link Currencies }
     * 
     */
    public Currencies createCurrencies() {
        return new Currencies();
    }

    /**
     * Create an instance of {@link AccountsRequest }
     * 
     */
    public AccountsRequest createAccountsRequest() {
        return new AccountsRequest();
    }

    /**
     * Create an instance of {@link TransferHistory }
     * 
     */
    public TransferHistory createTransferHistory() {
        return new TransferHistory();
    }

    /**
     * Create an instance of {@link CurrencyResponse }
     * 
     */
    public CurrencyResponse createCurrencyResponse() {
        return new CurrencyResponse();
    }

    /**
     * Create an instance of {@link LoadAccountsByGroupsResponse }
     * 
     */
    public LoadAccountsByGroupsResponse createLoadAccountsByGroupsResponse() {
        return new LoadAccountsByGroupsResponse();
    }

    /**
     * Create an instance of {@link CurrencyRequest }
     * 
     */
    public CurrencyRequest createCurrencyRequest() {
        return new CurrencyRequest();
    }

    /**
     * Create an instance of {@link LoadAccountPermissionsResponse }
     * 
     */
    public LoadAccountPermissionsResponse createLoadAccountPermissionsResponse() {
        return new LoadAccountPermissionsResponse();
    }

    /**
     * Create an instance of {@link MemberView }
     * 
     */
    public MemberView createMemberView() {
        return new MemberView();
    }

    /**
     * Create an instance of {@link LoadAccountsRequest }
     * 
     */
    public LoadAccountsRequest createLoadAccountsRequest() {
        return new LoadAccountsRequest();
    }

    /**
     * Create an instance of {@link LoadAccountPermissionsRequest }
     * 
     */
    public LoadAccountPermissionsRequest createLoadAccountPermissionsRequest() {
        return new LoadAccountPermissionsRequest();
    }

    /**
     * Create an instance of {@link LoadAccountsByIDResponse }
     * 
     */
    public LoadAccountsByIDResponse createLoadAccountsByIDResponse() {
        return new LoadAccountsByIDResponse();
    }

    /**
     * Create an instance of {@link TransactionException }
     * 
     */
    public TransactionException createTransactionException() {
        return new TransactionException();
    }

    /**
     * Create an instance of {@link BalanceInquiryRequest }
     * 
     */
    public BalanceInquiryRequest createBalanceInquiryRequest() {
        return new BalanceInquiryRequest();
    }

    /**
     * Create an instance of {@link Accounts }
     * 
     */
    public Accounts createAccounts() {
        return new Accounts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "createAccount")
    public JAXBElement<AccountsRequest> createCreateAccount(AccountsRequest value) {
        return new JAXBElement<AccountsRequest>(_CreateAccount_QNAME, AccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsByGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountsByGroups")
    public JAXBElement<LoadAccountsByGroupsRequest> createLoadAccountsByGroups(LoadAccountsByGroupsRequest value) {
        return new JAXBElement<LoadAccountsByGroupsRequest>(_LoadAccountsByGroups_QNAME, LoadAccountsByGroupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceInquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadBalanceInquiryResponse")
    public JAXBElement<BalanceInquiryResponse> createLoadBalanceInquiryResponse(BalanceInquiryResponse value) {
        return new JAXBElement<BalanceInquiryResponse>(_LoadBalanceInquiryResponse_QNAME, BalanceInquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "createCurrency")
    public JAXBElement<CurrencyRequest> createCreateCurrency(CurrencyRequest value) {
        return new JAXBElement<CurrencyRequest>(_CreateCurrency_QNAME, CurrencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsByIDRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountsByID")
    public JAXBElement<LoadAccountsByIDRequest> createLoadAccountsByID(LoadAccountsByIDRequest value) {
        return new JAXBElement<LoadAccountsByIDRequest>(_LoadAccountsByID_QNAME, LoadAccountsByIDRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadCurrencyResponse")
    public JAXBElement<CurrencyResponse> createLoadCurrencyResponse(CurrencyResponse value) {
        return new JAXBElement<CurrencyResponse>(_LoadCurrencyResponse_QNAME, CurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountPermissionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountPermissionsByID")
    public JAXBElement<LoadAccountPermissionsRequest> createLoadAccountPermissionsByID(LoadAccountPermissionsRequest value) {
        return new JAXBElement<LoadAccountPermissionsRequest>(_LoadAccountPermissionsByID_QNAME, LoadAccountPermissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountPermissionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountPermissionsByIDResponse")
    public JAXBElement<LoadAccountPermissionsResponse> createLoadAccountPermissionsByIDResponse(LoadAccountPermissionsResponse value) {
        return new JAXBElement<LoadAccountPermissionsResponse>(_LoadAccountPermissionsByIDResponse_QNAME, LoadAccountPermissionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccounts")
    public JAXBElement<LoadAccountsRequest> createLoadAccounts(LoadAccountsRequest value) {
        return new JAXBElement<LoadAccountsRequest>(_LoadAccounts_QNAME, LoadAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountPermissionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountPermissionsByAccountResponse")
    public JAXBElement<LoadAccountPermissionsResponse> createLoadAccountPermissionsByAccountResponse(LoadAccountPermissionsResponse value) {
        return new JAXBElement<LoadAccountPermissionsResponse>(_LoadAccountPermissionsByAccountResponse_QNAME, LoadAccountPermissionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "updateAccount")
    public JAXBElement<AccountsRequest> createUpdateAccount(AccountsRequest value) {
        return new JAXBElement<AccountsRequest>(_UpdateAccount_QNAME, AccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsPermissionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "updateAccountPermission")
    public JAXBElement<AccountsPermissionRequest> createUpdateAccountPermission(AccountsPermissionRequest value) {
        return new JAXBElement<AccountsPermissionRequest>(_UpdateAccountPermission_QNAME, AccountsPermissionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAllAccounts")
    public JAXBElement<LoadAccountsRequest> createLoadAllAccounts(LoadAccountsRequest value) {
        return new JAXBElement<LoadAccountsRequest>(_LoadAllAccounts_QNAME, LoadAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsPermissionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "createAccountPermission")
    public JAXBElement<AccountsPermissionRequest> createCreateAccountPermission(AccountsPermissionRequest value) {
        return new JAXBElement<AccountsPermissionRequest>(_CreateAccountPermission_QNAME, AccountsPermissionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadCurrency")
    public JAXBElement<CurrencyRequest> createLoadCurrency(CurrencyRequest value) {
        return new JAXBElement<CurrencyRequest>(_LoadCurrency_QNAME, CurrencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "headerAuth")
    public JAXBElement<Header> createHeaderAuth(Header value) {
        return new JAXBElement<Header>(_HeaderAuth_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountsResponse")
    public JAXBElement<LoadAccountsResponse> createLoadAccountsResponse(LoadAccountsResponse value) {
        return new JAXBElement<LoadAccountsResponse>(_LoadAccountsResponse_QNAME, LoadAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadTransactionHistoryResponse")
    public JAXBElement<TransactionHistoryResponse> createLoadTransactionHistoryResponse(TransactionHistoryResponse value) {
        return new JAXBElement<TransactionHistoryResponse>(_LoadTransactionHistoryResponse_QNAME, TransactionHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountsByIDResponse")
    public JAXBElement<LoadAccountsByIDResponse> createLoadAccountsByIDResponse(LoadAccountsByIDResponse value) {
        return new JAXBElement<LoadAccountsByIDResponse>(_LoadAccountsByIDResponse_QNAME, LoadAccountsByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsPermissionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "deleteAccountPermission")
    public JAXBElement<AccountsPermissionRequest> createDeleteAccountPermission(AccountsPermissionRequest value) {
        return new JAXBElement<AccountsPermissionRequest>(_DeleteAccountPermission_QNAME, AccountsPermissionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountPermissionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountPermissionsByAccount")
    public JAXBElement<LoadAccountPermissionsRequest> createLoadAccountPermissionsByAccount(LoadAccountPermissionsRequest value) {
        return new JAXBElement<LoadAccountPermissionsRequest>(_LoadAccountPermissionsByAccount_QNAME, LoadAccountPermissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "TransactionException")
    public JAXBElement<TransactionException> createTransactionException(TransactionException value) {
        return new JAXBElement<TransactionException>(_TransactionException_QNAME, TransactionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAllAccountsResponse")
    public JAXBElement<LoadAccountsResponse> createLoadAllAccountsResponse(LoadAccountsResponse value) {
        return new JAXBElement<LoadAccountsResponse>(_LoadAllAccountsResponse_QNAME, LoadAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "updateCurrency")
    public JAXBElement<CurrencyRequest> createUpdateCurrency(CurrencyRequest value) {
        return new JAXBElement<CurrencyRequest>(_UpdateCurrency_QNAME, CurrencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionHistoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadTransactionHistory")
    public JAXBElement<TransactionHistoryRequest> createLoadTransactionHistory(TransactionHistoryRequest value) {
        return new JAXBElement<TransactionHistoryRequest>(_LoadTransactionHistory_QNAME, TransactionHistoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadAccountsByGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadAccountsByGroupsResponse")
    public JAXBElement<LoadAccountsByGroupsResponse> createLoadAccountsByGroupsResponse(LoadAccountsByGroupsResponse value) {
        return new JAXBElement<LoadAccountsByGroupsResponse>(_LoadAccountsByGroupsResponse_QNAME, LoadAccountsByGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bellatrix.org/", name = "loadBalanceInquiry")
    public JAXBElement<BalanceInquiryRequest> createLoadBalanceInquiry(BalanceInquiryRequest value) {
        return new JAXBElement<BalanceInquiryRequest>(_LoadBalanceInquiry_QNAME, BalanceInquiryRequest.class, null, value);
    }

}
