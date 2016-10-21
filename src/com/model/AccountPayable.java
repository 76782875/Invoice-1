package com.model;

import java.math.BigDecimal;
import java.util.Date;

public class AccountPayable {

	/**
	 * ID
	 */
	private Integer id;
	/**
	 * ��ͬ���
	 */
	private String contractId;
	/**
	 * �ͻ���˾����
	 */
	private String companyName;
	/**
	 * ��Ʊ����
	 */
	private String invoiceContent;
	/**
	 * ��Ʊ����
	 */
	private String makeInvoiceDate;
	/**
	 * ��˰���
	 */
	private BigDecimal totalAmt;
	/**
	 * ����˰���
	 */
	private BigDecimal noTaxAmt;
	/**
	 * ˰��
	 */
	private String rate;
	/**
	 * ˰��
	 */
	private String taxAmt;
	/**
	 * ��ͬ�տ�����
	 */
	private Date expectPaymentDate;
	/**
	 * ��ͬ�տ�����
	 */
	private Integer paymentDays;
	/**
	 * ��������
	 */
	private Integer overdueDays;
	/**
	 * �տ�ʱ��
	 */
	private Date paymentDate;
	/**
	 * �����˿�
	 */
	private BigDecimal receiveAmt;
	/**
	 * δ���˿�
	 */
	private BigDecimal notReceiveAmt;
	/**
	 * ��Ŀ����
	 */
	private String sale;
	/**
	 * ��Ŀ����
	 */
	private String projectManager;
	/**
	 * ��ע
	 */
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInvoiceContent() {
		return invoiceContent;
	}

	public void setInvoiceContent(String invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public String getMakeInvoiceDate() {
		return makeInvoiceDate;
	}

	public void setMakeInvoiceDate(String makeInvoiceDate) {
		this.makeInvoiceDate = makeInvoiceDate;
	}

	public BigDecimal getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public BigDecimal getNoTaxAmt() {
		return noTaxAmt;
	}

	public void setNoTaxAmt(BigDecimal noTaxAmt) {
		this.noTaxAmt = noTaxAmt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTaxAmt() {
		return taxAmt;
	}

	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}

	public Date getExpectPaymentDate() {
		return expectPaymentDate;
	}

	public void setExpectPaymentDate(Date expectPaymentDate) {
		this.expectPaymentDate = expectPaymentDate;
	}

	public Integer getPaymentDays() {
		return paymentDays;
	}

	public void setPaymentDays(Integer paymentDays) {
		this.paymentDays = paymentDays;
	}

	public Integer getOverdueDays() {
		return overdueDays;
	}

	public void setOverdueDays(Integer overdueDays) {
		this.overdueDays = overdueDays;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getReceiveAmt() {
		return receiveAmt;
	}

	public void setReceiveAmt(BigDecimal receiveAmt) {
		this.receiveAmt = receiveAmt;
	}

	public BigDecimal getNotReceiveAmt() {
		return notReceiveAmt;
	}

	public void setNotReceiveAmt(BigDecimal notReceiveAmt) {
		this.notReceiveAmt = notReceiveAmt;
	}

	public String getSale() {
		return sale;
	}

	public void setSale(String sale) {
		this.sale = sale;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
