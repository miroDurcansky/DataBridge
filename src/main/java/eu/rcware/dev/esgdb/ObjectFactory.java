
package eu.rcware.dev.esgdb;

import org.datacontract.schemas._2004._07.esg_db_server.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.rcware.dev.esgdb package. 
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

    private final static QName _GetVariableStatsVariableKeys_QNAME = new QName("http://dev.rcware.eu/esgdb", "variableKeys");
    private final static QName _GetVariablesResponseGetVariablesResult_QNAME = new QName("http://dev.rcware.eu/esgdb", "GetVariablesResult");
    private final static QName _GetVariablesResponseReturnCode_QNAME = new QName("http://dev.rcware.eu/esgdb", "returnCode");
    private final static QName _GetParticularDataAsyncReferenceTime_QNAME = new QName("http://dev.rcware.eu/esgdb", "referenceTime");
    private final static QName _SaveDataRecords_QNAME = new QName("http://dev.rcware.eu/esgdb", "records");
    private final static QName _GetParticularDataResponseGetParticularDataResult_QNAME = new QName("http://dev.rcware.eu/esgdb", "GetParticularDataResult");
    private final static QName _EnsureVariablesVariables_QNAME = new QName("http://dev.rcware.eu/esgdb", "variables");
    private final static QName _GetVariableStatsResponseGetVariableStatsResult_QNAME = new QName("http://dev.rcware.eu/esgdb", "GetVariableStatsResult");
    private final static QName _GetDataVariablesKey_QNAME = new QName("http://dev.rcware.eu/esgdb", "variablesKey");
    private final static QName _GetAllVariablesResponseGetAllVariablesResult_QNAME = new QName("http://dev.rcware.eu/esgdb", "GetAllVariablesResult");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://dev.rcware.eu/esgdb", "GetDataResult");
    private final static QName _GetTransformedDataResponseGetTransformedDataResult_QNAME = new QName("http://dev.rcware.eu/esgdb", "GetTransformedDataResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.rcware.dev.esgdb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServerVersion }
     * 
     */
    public GetServerVersion createGetServerVersion() {
        return new GetServerVersion();
    }

    /**
     * Create an instance of {@link GetTransformedDataAsync }
     * 
     */
    public GetTransformedDataAsync createGetTransformedDataAsync() {
        return new GetTransformedDataAsync();
    }

    /**
     * Create an instance of {@link EnsureVariablesResponse }
     * 
     */
    public EnsureVariablesResponse createEnsureVariablesResponse() {
        return new EnsureVariablesResponse();
    }

    /**
     * Create an instance of {@link GetAllVariablesResponse }
     * 
     */
    public GetAllVariablesResponse createGetAllVariablesResponse() {
        return new GetAllVariablesResponse();
    }

    /**
     * Create an instance of {@link GetParticularDataAsyncResponse }
     * 
     */
    public GetParticularDataAsyncResponse createGetParticularDataAsyncResponse() {
        return new GetParticularDataAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteVariablesResponse }
     * 
     */
    public DeleteVariablesResponse createDeleteVariablesResponse() {
        return new DeleteVariablesResponse();
    }

    /**
     * Create an instance of {@link GetVariableStatsResponse }
     * 
     */
    public GetVariableStatsResponse createGetVariableStatsResponse() {
        return new GetVariableStatsResponse();
    }

    /**
     * Create an instance of {@link GetParticularDataResponse }
     * 
     */
    public GetParticularDataResponse createGetParticularDataResponse() {
        return new GetParticularDataResponse();
    }

    /**
     * Create an instance of {@link DeleteDataResponse }
     * 
     */
    public DeleteDataResponse createDeleteDataResponse() {
        return new DeleteDataResponse();
    }

    /**
     * Create an instance of {@link GetParticularDataAsync }
     * 
     */
    public GetParticularDataAsync createGetParticularDataAsync() {
        return new GetParticularDataAsync();
    }

    /**
     * Create an instance of {@link GetVariableStats }
     * 
     */
    public GetVariableStats createGetVariableStats() {
        return new GetVariableStats();
    }

    /**
     * Create an instance of {@link GetParticularData }
     * 
     */
    public GetParticularData createGetParticularData() {
        return new GetParticularData();
    }

    /**
     * Create an instance of {@link GetVariablesResponse }
     * 
     */
    public GetVariablesResponse createGetVariablesResponse() {
        return new GetVariablesResponse();
    }

    /**
     * Create an instance of {@link ServerAlive }
     * 
     */
    public ServerAlive createServerAlive() {
        return new ServerAlive();
    }

    /**
     * Create an instance of {@link DeleteData }
     * 
     */
    public DeleteData createDeleteData() {
        return new DeleteData();
    }

    /**
     * Create an instance of {@link CheckCredentialsResponse }
     * 
     */
    public CheckCredentialsResponse createCheckCredentialsResponse() {
        return new CheckCredentialsResponse();
    }

    /**
     * Create an instance of {@link GetVariableStatsAsync }
     * 
     */
    public GetVariableStatsAsync createGetVariableStatsAsync() {
        return new GetVariableStatsAsync();
    }

    /**
     * Create an instance of {@link CheckCredentials }
     * 
     */
    public CheckCredentials createCheckCredentials() {
        return new CheckCredentials();
    }

    /**
     * Create an instance of {@link DeleteVariables }
     * 
     */
    public DeleteVariables createDeleteVariables() {
        return new DeleteVariables();
    }

    /**
     * Create an instance of {@link EnsureVariables }
     * 
     */
    public EnsureVariables createEnsureVariables() {
        return new EnsureVariables();
    }

    /**
     * Create an instance of {@link GetDataAsyncResponse }
     * 
     */
    public GetDataAsyncResponse createGetDataAsyncResponse() {
        return new GetDataAsyncResponse();
    }

    /**
     * Create an instance of {@link GetTransformedDataAsyncResponse }
     * 
     */
    public GetTransformedDataAsyncResponse createGetTransformedDataAsyncResponse() {
        return new GetTransformedDataAsyncResponse();
    }

    /**
     * Create an instance of {@link SaveData }
     * 
     */
    public SaveData createSaveData() {
        return new SaveData();
    }

    /**
     * Create an instance of {@link GetVariables }
     * 
     */
    public GetVariables createGetVariables() {
        return new GetVariables();
    }

    /**
     * Create an instance of {@link SaveDataResponse }
     * 
     */
    public SaveDataResponse createSaveDataResponse() {
        return new SaveDataResponse();
    }

    /**
     * Create an instance of {@link GetDataAsync }
     * 
     */
    public GetDataAsync createGetDataAsync() {
        return new GetDataAsync();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetVariableStatsAsyncResponse }
     * 
     */
    public GetVariableStatsAsyncResponse createGetVariableStatsAsyncResponse() {
        return new GetVariableStatsAsyncResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetTransformedDataResponse }
     * 
     */
    public GetTransformedDataResponse createGetTransformedDataResponse() {
        return new GetTransformedDataResponse();
    }

    /**
     * Create an instance of {@link ServerAliveResponse }
     * 
     */
    public ServerAliveResponse createServerAliveResponse() {
        return new ServerAliveResponse();
    }

    /**
     * Create an instance of {@link GetServerVersionResponse }
     * 
     */
    public GetServerVersionResponse createGetServerVersionResponse() {
        return new GetServerVersionResponse();
    }

    /**
     * Create an instance of {@link GetTransformedData }
     * 
     */
    public GetTransformedData createGetTransformedData() {
        return new GetTransformedData();
    }

    /**
     * Create an instance of {@link GetAllVariables }
     * 
     */
    public GetAllVariables createGetAllVariables() {
        return new GetAllVariables();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetVariableStats.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetVariableStatsVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetVariableStats.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "GetVariablesResult", scope = GetVariablesResponse.class)
    public JAXBElement<ArrayOfVariableDescription> createGetVariablesResponseGetVariablesResult(ArrayOfVariableDescription value) {
        return new JAXBElement<ArrayOfVariableDescription>(_GetVariablesResponseGetVariablesResult_QNAME, ArrayOfVariableDescription.class, GetVariablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = GetVariablesResponse.class)
    public JAXBElement<String> createGetVariablesResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, GetVariablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "referenceTime", scope = GetParticularDataAsync.class)
    public JAXBElement<XMLGregorianCalendar> createGetParticularDataAsyncReferenceTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetParticularDataAsyncReferenceTime_QNAME, XMLGregorianCalendar.class, GetParticularDataAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetParticularDataAsync.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetParticularDataAsyncVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetParticularDataAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetVariableStatsAsync.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetVariableStatsAsyncVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetVariableStatsAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = DeleteDataResponse.class)
    public JAXBElement<String> createDeleteDataResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, DeleteDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValueRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "records", scope = SaveData.class)
    public JAXBElement<ArrayOfValueRecord> createSaveDataRecords(ArrayOfValueRecord value) {
        return new JAXBElement<ArrayOfValueRecord>(_SaveDataRecords_QNAME, ArrayOfValueRecord.class, SaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "referenceTime", scope = GetParticularData.class)
    public JAXBElement<XMLGregorianCalendar> createGetParticularDataReferenceTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetParticularDataAsyncReferenceTime_QNAME, XMLGregorianCalendar.class, GetParticularData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetParticularData.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetParticularDataVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetParticularData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "GetParticularDataResult", scope = GetParticularDataResponse.class)
    public JAXBElement<ArrayOfMvr> createGetParticularDataResponseGetParticularDataResult(ArrayOfMvr value) {
        return new JAXBElement<ArrayOfMvr>(_GetParticularDataResponseGetParticularDataResult_QNAME, ArrayOfMvr.class, GetParticularDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = GetParticularDataResponse.class)
    public JAXBElement<String> createGetParticularDataResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, GetParticularDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetDataAsync.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetDataAsyncVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetDataAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variables", scope = EnsureVariables.class)
    public JAXBElement<ArrayOfVariableDescription> createEnsureVariablesVariables(ArrayOfVariableDescription value) {
        return new JAXBElement<ArrayOfVariableDescription>(_EnsureVariablesVariables_QNAME, ArrayOfVariableDescription.class, EnsureVariables.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetTransformedData.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetTransformedDataVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetTransformedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = DeleteData.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createDeleteDataVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, DeleteData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "GetVariableStatsResult", scope = GetVariableStatsResponse.class)
    public JAXBElement<ArrayOfVariableStatistics> createGetVariableStatsResponseGetVariableStatsResult(ArrayOfVariableStatistics value) {
        return new JAXBElement<ArrayOfVariableStatistics>(_GetVariableStatsResponseGetVariableStatsResult_QNAME, ArrayOfVariableStatistics.class, GetVariableStatsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = GetVariableStatsResponse.class)
    public JAXBElement<String> createGetVariableStatsResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, GetVariableStatsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = DeleteVariables.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createDeleteVariablesVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, DeleteVariables.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variablesKey", scope = GetData.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetDataVariablesKey(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetDataVariablesKey_QNAME, ArrayOfArrayOfKeyValuePair.class, GetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "GetAllVariablesResult", scope = GetAllVariablesResponse.class)
    public JAXBElement<ArrayOfVariableDescription> createGetAllVariablesResponseGetAllVariablesResult(ArrayOfVariableDescription value) {
        return new JAXBElement<ArrayOfVariableDescription>(_GetAllVariablesResponseGetAllVariablesResult_QNAME, ArrayOfVariableDescription.class, GetAllVariablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetTransformedDataAsync.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetTransformedDataAsyncVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetTransformedDataAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "variableKeys", scope = GetVariables.class)
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createGetVariablesVariableKeys(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_GetVariableStatsVariableKeys_QNAME, ArrayOfArrayOfKeyValuePair.class, GetVariables.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = DeleteVariablesResponse.class)
    public JAXBElement<String> createDeleteVariablesResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, DeleteVariablesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<ArrayOfMvr> createGetDataResponseGetDataResult(ArrayOfMvr value) {
        return new JAXBElement<ArrayOfMvr>(_GetDataResponseGetDataResult_QNAME, ArrayOfMvr.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = GetDataResponse.class)
    public JAXBElement<String> createGetDataResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVAg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "GetTransformedDataResult", scope = GetTransformedDataResponse.class)
    public JAXBElement<ArrayOfVAg> createGetTransformedDataResponseGetTransformedDataResult(ArrayOfVAg value) {
        return new JAXBElement<ArrayOfVAg>(_GetTransformedDataResponseGetTransformedDataResult_QNAME, ArrayOfVAg.class, GetTransformedDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.rcware.eu/esgdb", name = "returnCode", scope = GetTransformedDataResponse.class)
    public JAXBElement<String> createGetTransformedDataResponseReturnCode(String value) {
        return new JAXBElement<String>(_GetVariablesResponseReturnCode_QNAME, String.class, GetTransformedDataResponse.class, value);
    }

}
