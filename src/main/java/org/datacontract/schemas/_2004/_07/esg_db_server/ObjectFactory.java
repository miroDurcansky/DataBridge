
package org.datacontract.schemas._2004._07.esg_db_server;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.esg_db_server package. 
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

    private final static QName _ArrayOfKeyValuePair_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfKeyValuePair");
    private final static QName _InterpolationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "InterpolationType");
    private final static QName _VAg_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "VAg");
    private final static QName _Tp_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Tp");
    private final static QName _ArrayOfI_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfI");
    private final static QName _ArrayOfVAg_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfVAg");
    private final static QName _AggregationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "AggregationType");
    private final static QName _EnsureVariablesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "EnsureVariablesResult");
    private final static QName _ParticularDataSpecification_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ParticularDataSpecification");
    private final static QName _VariableStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "VariableStatistics");
    private final static QName _GetParticularDataAsyncResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "GetParticularDataAsyncResult");
    private final static QName _Interval_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Interval");
    private final static QName _ArrayOfArrayOfKeyValuePair_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfArrayOfKeyValuePair");
    private final static QName _GetVariableStatsAsyncResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "GetVariableStatsAsyncResult");
    private final static QName _KeyValuePair_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "KeyValuePair");
    private final static QName _HistoryValueType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "HistoryValueType");
    private final static QName _GetTransformedDataAsyncResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "GetTransformedDataAsyncResult");
    private final static QName _ArrayOfValueRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfValueRecord");
    private final static QName _ArrayOfInterval_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfInterval");
    private final static QName _I_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "I");
    private final static QName _Mvr_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Mvr");
    private final static QName _VariableDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "VariableDescription");
    private final static QName _ArrayOfVariableDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfVariableDescription");
    private final static QName _ArrayOfVariableStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfVariableStatistics");
    private final static QName _ArrayOfMvr_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfMvr");
    private final static QName _Credentials_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Credentials");
    private final static QName _ValueRecord_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ValueRecord");
    private final static QName _AggregationRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "AggregationRequest");
    private final static QName _ArrayOfAggregationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ArrayOfAggregationType");
    private final static QName _GetDataAsyncResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "GetDataAsyncResult");
    private final static QName _VAgData_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Data");
    private final static QName _VAgKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Keys");
    private final static QName _TpS_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "S");
    private final static QName _KeyValuePairValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Value");
    private final static QName _KeyValuePairKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Key");
    private final static QName _GetParticularDataAsyncResultReturnCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "ReturnCode");
    private final static QName _IntervalFirst_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "First");
    private final static QName _IntervalSum_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Sum");
    private final static QName _IntervalMed_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Med");
    private final static QName _IntervalAvg_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Avg");
    private final static QName _IntervalMin_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Min");
    private final static QName _IntervalLast_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Last");
    private final static QName _IntervalMax_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Max");
    private final static QName _MvrVals_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Vals");
    private final static QName _CredentialsName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Name");
    private final static QName _CredentialsPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Password");
    private final static QName _IIv_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Iv");
    private final static QName _IBinV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "BinV");
    private final static QName _ISv_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Sv");
    private final static QName _IDv_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Dv");
    private final static QName _IBv_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Bv");
    private final static QName _IDtv_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Dtv");
    private final static QName _ValueRecordStringValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "StringValue");
    private final static QName _ValueRecordBlobValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "BlobValue");
    private final static QName _AggregationRequestIsoPattern_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "IsoPattern");
    private final static QName _AggregationRequestTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "Types");
    private final static QName _AggregationRequestTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", "TimeZone");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.esg_db_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link AggregationRequest }
     * 
     */
    public AggregationRequest createAggregationRequest() {
        return new AggregationRequest();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfKeyValuePair }
     * 
     */
    public ArrayOfArrayOfKeyValuePair createArrayOfArrayOfKeyValuePair() {
        return new ArrayOfArrayOfKeyValuePair();
    }

    /**
     * Create an instance of {@link EnsureVariablesResult }
     * 
     */
    public EnsureVariablesResult createEnsureVariablesResult() {
        return new EnsureVariablesResult();
    }

    /**
     * Create an instance of {@link ArrayOfVariableDescription }
     * 
     */
    public ArrayOfVariableDescription createArrayOfVariableDescription() {
        return new ArrayOfVariableDescription();
    }

    /**
     * Create an instance of {@link GetParticularDataAsyncResult }
     * 
     */
    public GetParticularDataAsyncResult createGetParticularDataAsyncResult() {
        return new GetParticularDataAsyncResult();
    }

    /**
     * Create an instance of {@link ArrayOfVariableStatistics }
     * 
     */
    public ArrayOfVariableStatistics createArrayOfVariableStatistics() {
        return new ArrayOfVariableStatistics();
    }

    /**
     * Create an instance of {@link ArrayOfMvr }
     * 
     */
    public ArrayOfMvr createArrayOfMvr() {
        return new ArrayOfMvr();
    }

    /**
     * Create an instance of {@link GetDataAsyncResult }
     * 
     */
    public GetDataAsyncResult createGetDataAsyncResult() {
        return new GetDataAsyncResult();
    }

    /**
     * Create an instance of {@link GetTransformedDataAsyncResult }
     * 
     */
    public GetTransformedDataAsyncResult createGetTransformedDataAsyncResult() {
        return new GetTransformedDataAsyncResult();
    }

    /**
     * Create an instance of {@link ArrayOfValueRecord }
     * 
     */
    public ArrayOfValueRecord createArrayOfValueRecord() {
        return new ArrayOfValueRecord();
    }

    /**
     * Create an instance of {@link GetVariableStatsAsyncResult }
     * 
     */
    public GetVariableStatsAsyncResult createGetVariableStatsAsyncResult() {
        return new GetVariableStatsAsyncResult();
    }

    /**
     * Create an instance of {@link ArrayOfVAg }
     * 
     */
    public ArrayOfVAg createArrayOfVAg() {
        return new ArrayOfVAg();
    }

    /**
     * Create an instance of {@link VariableStatistics }
     * 
     */
    public VariableStatistics createVariableStatistics() {
        return new VariableStatistics();
    }

    /**
     * Create an instance of {@link VariableDescription }
     * 
     */
    public VariableDescription createVariableDescription() {
        return new VariableDescription();
    }

    /**
     * Create an instance of {@link Mvr }
     * 
     */
    public Mvr createMvr() {
        return new Mvr();
    }

    /**
     * Create an instance of {@link I }
     * 
     */
    public I createI() {
        return new I();
    }

    /**
     * Create an instance of {@link ArrayOfI }
     * 
     */
    public ArrayOfI createArrayOfI() {
        return new ArrayOfI();
    }

    /**
     * Create an instance of {@link ArrayOfInterval }
     * 
     */
    public ArrayOfInterval createArrayOfInterval() {
        return new ArrayOfInterval();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValuePair }
     * 
     */
    public ArrayOfKeyValuePair createArrayOfKeyValuePair() {
        return new ArrayOfKeyValuePair();
    }

    /**
     * Create an instance of {@link Tp }
     * 
     */
    public Tp createTp() {
        return new Tp();
    }

    /**
     * Create an instance of {@link VAg }
     * 
     */
    public VAg createVAg() {
        return new VAg();
    }

    /**
     * Create an instance of {@link KeyValuePair }
     * 
     */
    public KeyValuePair createKeyValuePair() {
        return new KeyValuePair();
    }

    /**
     * Create an instance of {@link ArrayOfAggregationType }
     * 
     */
    public ArrayOfAggregationType createArrayOfAggregationType() {
        return new ArrayOfAggregationType();
    }

    /**
     * Create an instance of {@link ValueRecord }
     * 
     */
    public ValueRecord createValueRecord() {
        return new ValueRecord();
    }

    /**
     * Create an instance of {@link Interval }
     * 
     */
    public Interval createInterval() {
        return new Interval();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfKeyValuePair")
    public JAXBElement<ArrayOfKeyValuePair> createArrayOfKeyValuePair(ArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfKeyValuePair>(_ArrayOfKeyValuePair_QNAME, ArrayOfKeyValuePair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterpolationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "InterpolationType")
    public JAXBElement<InterpolationType> createInterpolationType(InterpolationType value) {
        return new JAXBElement<InterpolationType>(_InterpolationType_QNAME, InterpolationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VAg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "VAg")
    public JAXBElement<VAg> createVAg(VAg value) {
        return new JAXBElement<VAg>(_VAg_QNAME, VAg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Tp")
    public JAXBElement<Tp> createTp(Tp value) {
        return new JAXBElement<Tp>(_Tp_QNAME, Tp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfI")
    public JAXBElement<ArrayOfI> createArrayOfI(ArrayOfI value) {
        return new JAXBElement<ArrayOfI>(_ArrayOfI_QNAME, ArrayOfI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVAg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfVAg")
    public JAXBElement<ArrayOfVAg> createArrayOfVAg(ArrayOfVAg value) {
        return new JAXBElement<ArrayOfVAg>(_ArrayOfVAg_QNAME, ArrayOfVAg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "AggregationType")
    public JAXBElement<AggregationType> createAggregationType(AggregationType value) {
        return new JAXBElement<AggregationType>(_AggregationType_QNAME, AggregationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnsureVariablesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "EnsureVariablesResult")
    public JAXBElement<EnsureVariablesResult> createEnsureVariablesResult(EnsureVariablesResult value) {
        return new JAXBElement<EnsureVariablesResult>(_EnsureVariablesResult_QNAME, EnsureVariablesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParticularDataSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ParticularDataSpecification")
    public JAXBElement<ParticularDataSpecification> createParticularDataSpecification(ParticularDataSpecification value) {
        return new JAXBElement<ParticularDataSpecification>(_ParticularDataSpecification_QNAME, ParticularDataSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "VariableStatistics")
    public JAXBElement<VariableStatistics> createVariableStatistics(VariableStatistics value) {
        return new JAXBElement<VariableStatistics>(_VariableStatistics_QNAME, VariableStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParticularDataAsyncResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "GetParticularDataAsyncResult")
    public JAXBElement<GetParticularDataAsyncResult> createGetParticularDataAsyncResult(GetParticularDataAsyncResult value) {
        return new JAXBElement<GetParticularDataAsyncResult>(_GetParticularDataAsyncResult_QNAME, GetParticularDataAsyncResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Interval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Interval")
    public JAXBElement<Interval> createInterval(Interval value) {
        return new JAXBElement<Interval>(_Interval_QNAME, Interval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfArrayOfKeyValuePair")
    public JAXBElement<ArrayOfArrayOfKeyValuePair> createArrayOfArrayOfKeyValuePair(ArrayOfArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfArrayOfKeyValuePair>(_ArrayOfArrayOfKeyValuePair_QNAME, ArrayOfArrayOfKeyValuePair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVariableStatsAsyncResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "GetVariableStatsAsyncResult")
    public JAXBElement<GetVariableStatsAsyncResult> createGetVariableStatsAsyncResult(GetVariableStatsAsyncResult value) {
        return new JAXBElement<GetVariableStatsAsyncResult>(_GetVariableStatsAsyncResult_QNAME, GetVariableStatsAsyncResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "KeyValuePair")
    public JAXBElement<KeyValuePair> createKeyValuePair(KeyValuePair value) {
        return new JAXBElement<KeyValuePair>(_KeyValuePair_QNAME, KeyValuePair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "HistoryValueType")
    public JAXBElement<HistoryValueType> createHistoryValueType(HistoryValueType value) {
        return new JAXBElement<HistoryValueType>(_HistoryValueType_QNAME, HistoryValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransformedDataAsyncResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "GetTransformedDataAsyncResult")
    public JAXBElement<GetTransformedDataAsyncResult> createGetTransformedDataAsyncResult(GetTransformedDataAsyncResult value) {
        return new JAXBElement<GetTransformedDataAsyncResult>(_GetTransformedDataAsyncResult_QNAME, GetTransformedDataAsyncResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfValueRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfValueRecord")
    public JAXBElement<ArrayOfValueRecord> createArrayOfValueRecord(ArrayOfValueRecord value) {
        return new JAXBElement<ArrayOfValueRecord>(_ArrayOfValueRecord_QNAME, ArrayOfValueRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfInterval")
    public JAXBElement<ArrayOfInterval> createArrayOfInterval(ArrayOfInterval value) {
        return new JAXBElement<ArrayOfInterval>(_ArrayOfInterval_QNAME, ArrayOfInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link I }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "I")
    public JAXBElement<I> createI(I value) {
        return new JAXBElement<I>(_I_QNAME, I.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mvr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Mvr")
    public JAXBElement<Mvr> createMvr(Mvr value) {
        return new JAXBElement<Mvr>(_Mvr_QNAME, Mvr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "VariableDescription")
    public JAXBElement<VariableDescription> createVariableDescription(VariableDescription value) {
        return new JAXBElement<VariableDescription>(_VariableDescription_QNAME, VariableDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfVariableDescription")
    public JAXBElement<ArrayOfVariableDescription> createArrayOfVariableDescription(ArrayOfVariableDescription value) {
        return new JAXBElement<ArrayOfVariableDescription>(_ArrayOfVariableDescription_QNAME, ArrayOfVariableDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfVariableStatistics")
    public JAXBElement<ArrayOfVariableStatistics> createArrayOfVariableStatistics(ArrayOfVariableStatistics value) {
        return new JAXBElement<ArrayOfVariableStatistics>(_ArrayOfVariableStatistics_QNAME, ArrayOfVariableStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfMvr")
    public JAXBElement<ArrayOfMvr> createArrayOfMvr(ArrayOfMvr value) {
        return new JAXBElement<ArrayOfMvr>(_ArrayOfMvr_QNAME, ArrayOfMvr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ValueRecord")
    public JAXBElement<ValueRecord> createValueRecord(ValueRecord value) {
        return new JAXBElement<ValueRecord>(_ValueRecord_QNAME, ValueRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "AggregationRequest")
    public JAXBElement<AggregationRequest> createAggregationRequest(AggregationRequest value) {
        return new JAXBElement<AggregationRequest>(_AggregationRequest_QNAME, AggregationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAggregationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ArrayOfAggregationType")
    public JAXBElement<ArrayOfAggregationType> createArrayOfAggregationType(ArrayOfAggregationType value) {
        return new JAXBElement<ArrayOfAggregationType>(_ArrayOfAggregationType_QNAME, ArrayOfAggregationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataAsyncResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "GetDataAsyncResult")
    public JAXBElement<GetDataAsyncResult> createGetDataAsyncResult(GetDataAsyncResult value) {
        return new JAXBElement<GetDataAsyncResult>(_GetDataAsyncResult_QNAME, GetDataAsyncResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Data", scope = VAg.class)
    public JAXBElement<ArrayOfInterval> createVAgData(ArrayOfInterval value) {
        return new JAXBElement<ArrayOfInterval>(_VAgData_QNAME, ArrayOfInterval.class, VAg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Keys", scope = VAg.class)
    public JAXBElement<ArrayOfKeyValuePair> createVAgKeys(ArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfKeyValuePair>(_VAgKeys_QNAME, ArrayOfKeyValuePair.class, VAg.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "S", scope = Tp.class)
    public JAXBElement<XMLGregorianCalendar> createTpS(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TpS_QNAME, XMLGregorianCalendar.class, Tp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Value", scope = KeyValuePair.class)
    public JAXBElement<String> createKeyValuePairValue(String value) {
        return new JAXBElement<String>(_KeyValuePairValue_QNAME, String.class, KeyValuePair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Key", scope = KeyValuePair.class)
    public JAXBElement<String> createKeyValuePairKey(String value) {
        return new JAXBElement<String>(_KeyValuePairKey_QNAME, String.class, KeyValuePair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Keys", scope = VariableStatistics.class)
    public JAXBElement<ArrayOfKeyValuePair> createVariableStatisticsKeys(ArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfKeyValuePair>(_VAgKeys_QNAME, ArrayOfKeyValuePair.class, VariableStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Data", scope = GetParticularDataAsyncResult.class)
    public JAXBElement<ArrayOfMvr> createGetParticularDataAsyncResultData(ArrayOfMvr value) {
        return new JAXBElement<ArrayOfMvr>(_VAgData_QNAME, ArrayOfMvr.class, GetParticularDataAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ReturnCode", scope = GetParticularDataAsyncResult.class)
    public JAXBElement<String> createGetParticularDataAsyncResultReturnCode(String value) {
        return new JAXBElement<String>(_GetParticularDataAsyncResultReturnCode_QNAME, String.class, GetParticularDataAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "First", scope = Interval.class)
    public JAXBElement<Tp> createIntervalFirst(Tp value) {
        return new JAXBElement<Tp>(_IntervalFirst_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Sum", scope = Interval.class)
    public JAXBElement<Tp> createIntervalSum(Tp value) {
        return new JAXBElement<Tp>(_IntervalSum_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Med", scope = Interval.class)
    public JAXBElement<Tp> createIntervalMed(Tp value) {
        return new JAXBElement<Tp>(_IntervalMed_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Avg", scope = Interval.class)
    public JAXBElement<Tp> createIntervalAvg(Tp value) {
        return new JAXBElement<Tp>(_IntervalAvg_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Min", scope = Interval.class)
    public JAXBElement<Tp> createIntervalMin(Tp value) {
        return new JAXBElement<Tp>(_IntervalMin_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Last", scope = Interval.class)
    public JAXBElement<Tp> createIntervalLast(Tp value) {
        return new JAXBElement<Tp>(_IntervalLast_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Max", scope = Interval.class)
    public JAXBElement<Tp> createIntervalMax(Tp value) {
        return new JAXBElement<Tp>(_IntervalMax_QNAME, Tp.class, Interval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Vals", scope = Mvr.class)
    public JAXBElement<ArrayOfI> createMvrVals(ArrayOfI value) {
        return new JAXBElement<ArrayOfI>(_MvrVals_QNAME, ArrayOfI.class, Mvr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Keys", scope = Mvr.class)
    public JAXBElement<ArrayOfKeyValuePair> createMvrKeys(ArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfKeyValuePair>(_VAgKeys_QNAME, ArrayOfKeyValuePair.class, Mvr.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Keys", scope = VariableDescription.class)
    public JAXBElement<ArrayOfKeyValuePair> createVariableDescriptionKeys(ArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfKeyValuePair>(_VAgKeys_QNAME, ArrayOfKeyValuePair.class, VariableDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Data", scope = GetVariableStatsAsyncResult.class)
    public JAXBElement<ArrayOfVariableStatistics> createGetVariableStatsAsyncResultData(ArrayOfVariableStatistics value) {
        return new JAXBElement<ArrayOfVariableStatistics>(_VAgData_QNAME, ArrayOfVariableStatistics.class, GetVariableStatsAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ReturnCode", scope = GetVariableStatsAsyncResult.class)
    public JAXBElement<String> createGetVariableStatsAsyncResultReturnCode(String value) {
        return new JAXBElement<String>(_GetParticularDataAsyncResultReturnCode_QNAME, String.class, GetVariableStatsAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Name", scope = Credentials.class)
    public JAXBElement<String> createCredentialsName(String value) {
        return new JAXBElement<String>(_CredentialsName_QNAME, String.class, Credentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Password", scope = Credentials.class)
    public JAXBElement<String> createCredentialsPassword(String value) {
        return new JAXBElement<String>(_CredentialsPassword_QNAME, String.class, Credentials.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMvr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Data", scope = GetDataAsyncResult.class)
    public JAXBElement<ArrayOfMvr> createGetDataAsyncResultData(ArrayOfMvr value) {
        return new JAXBElement<ArrayOfMvr>(_VAgData_QNAME, ArrayOfMvr.class, GetDataAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ReturnCode", scope = GetDataAsyncResult.class)
    public JAXBElement<String> createGetDataAsyncResultReturnCode(String value) {
        return new JAXBElement<String>(_GetParticularDataAsyncResultReturnCode_QNAME, String.class, GetDataAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Iv", scope = I.class)
    public JAXBElement<Long> createIIv(Long value) {
        return new JAXBElement<Long>(_IIv_QNAME, Long.class, I.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "BinV", scope = I.class)
    public JAXBElement<byte[]> createIBinV(byte[] value) {
        return new JAXBElement<byte[]>(_IBinV_QNAME, byte[].class, I.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Sv", scope = I.class)
    public JAXBElement<String> createISv(String value) {
        return new JAXBElement<String>(_ISv_QNAME, String.class, I.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Dv", scope = I.class)
    public JAXBElement<Double> createIDv(Double value) {
        return new JAXBElement<Double>(_IDv_QNAME, Double.class, I.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Bv", scope = I.class)
    public JAXBElement<Boolean> createIBv(Boolean value) {
        return new JAXBElement<Boolean>(_IBv_QNAME, Boolean.class, I.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Dtv", scope = I.class)
    public JAXBElement<XMLGregorianCalendar> createIDtv(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IDtv_QNAME, XMLGregorianCalendar.class, I.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVAg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Data", scope = GetTransformedDataAsyncResult.class)
    public JAXBElement<ArrayOfVAg> createGetTransformedDataAsyncResultData(ArrayOfVAg value) {
        return new JAXBElement<ArrayOfVAg>(_VAgData_QNAME, ArrayOfVAg.class, GetTransformedDataAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ReturnCode", scope = GetTransformedDataAsyncResult.class)
    public JAXBElement<String> createGetTransformedDataAsyncResultReturnCode(String value) {
        return new JAXBElement<String>(_GetParticularDataAsyncResultReturnCode_QNAME, String.class, GetTransformedDataAsyncResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "StringValue", scope = ValueRecord.class)
    public JAXBElement<String> createValueRecordStringValue(String value) {
        return new JAXBElement<String>(_ValueRecordStringValue_QNAME, String.class, ValueRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "BlobValue", scope = ValueRecord.class)
    public JAXBElement<byte[]> createValueRecordBlobValue(byte[] value) {
        return new JAXBElement<byte[]>(_ValueRecordBlobValue_QNAME, byte[].class, ValueRecord.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Keys", scope = ValueRecord.class)
    public JAXBElement<ArrayOfKeyValuePair> createValueRecordKeys(ArrayOfKeyValuePair value) {
        return new JAXBElement<ArrayOfKeyValuePair>(_VAgKeys_QNAME, ArrayOfKeyValuePair.class, ValueRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "IsoPattern", scope = AggregationRequest.class)
    public JAXBElement<ArrayOfstring> createAggregationRequestIsoPattern(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AggregationRequestIsoPattern_QNAME, ArrayOfstring.class, AggregationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAggregationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "Types", scope = AggregationRequest.class)
    public JAXBElement<ArrayOfAggregationType> createAggregationRequestTypes(ArrayOfAggregationType value) {
        return new JAXBElement<ArrayOfAggregationType>(_AggregationRequestTypes_QNAME, ArrayOfAggregationType.class, AggregationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "TimeZone", scope = AggregationRequest.class)
    public JAXBElement<String> createAggregationRequestTimeZone(String value) {
        return new JAXBElement<String>(_AggregationRequestTimeZone_QNAME, String.class, AggregationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ESG.Db.Server.Shared", name = "ReturnCode", scope = EnsureVariablesResult.class)
    public JAXBElement<String> createEnsureVariablesResultReturnCode(String value) {
        return new JAXBElement<String>(_GetParticularDataAsyncResultReturnCode_QNAME, String.class, EnsureVariablesResult.class, value);
    }

}
