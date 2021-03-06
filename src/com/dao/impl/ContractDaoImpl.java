package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dao.ContractDao;
import com.dao.DaoJdbcTemplate;
import com.model.Contract;
import com.util.DateUtils;
import com.util.StringUtils;
@Repository("contractDao")
public class ContractDaoImpl extends DaoJdbcTemplate implements ContractDao {

	@Override
	public void add(Contract contract) {
		StringBuffer sb = new StringBuffer("INSERT INTO t_contract (")
			.append("CONTRACT_ID,")
			.append("CONTRACT_TYPE,")
			.append("COMPANY_NAME_OF_FIRST,")
			.append("CONTACT_NAME_OF_FIRST,")
			.append("COMPANY_NAME_OF_SECOND,")
			.append("CONTACT_NAME_OF_SECOND,")
			.append("COMPANY_NAME_OF_THIRD,")
			.append("CONTACT_NAME_OF_THIRD,")
			.append("SALES,")
			.append("ITEM_NAME,")
			.append("CONTRACT_SIGN_DATE,")
			.append("CONTRACT_START_DATE,")
			.append("CONTRACT_END_DATE,")
			.append("AMT,")
			.append("PAYMENT_TIMES,")
			.append("COMPLETE_INVOICE_NUMBER,")
			.append("COMPLETE_INVOICE_AMT,")
			.append("REMAIN_INVOICE_AMT,")
			.append("REMARK)")
			.append(" VALUES('")
			.append(contract.getContractId())
			.append("','")
			.append(contract.getContractType())
			.append("','")
			.append(contract.getCompanyNameOfFirst())
			.append("','")
			.append(contract.getContactNameOfFirst())
			.append("','")
			.append(contract.getCompanyNameOfSecond())
			.append("','")
			.append(contract.getContactNameOfSecond())
			.append("','")
			.append(contract.getCompanyNameOfThird())
			.append("','")
			.append(contract.getContactNameOfThird())
			.append("','")
			.append(contract.getContactNameOfSecond())
			.append("','")
			.append(contract.getItemName())
			.append("',");
		if(null!=contract.getContractSignDate()
				&&!StringUtils.isBlank(contract.getContractSignDate())
				&&!StringUtils.isEmpty(contract.getContractSignDate())){
			sb.append("'");
			sb.append(contract.getContractSignDate());
			sb.append("'");
		}else{
			sb.append("null");
		}
			sb.append(",");
		if(null!=contract.getContractStartDate()
				&&!StringUtils.isBlank(contract.getContractStartDate())
				&&!StringUtils.isEmpty(contract.getContractStartDate())){
			sb.append("'");
			sb.append(contract.getContractStartDate());
			sb.append("'");
		}else{
			sb.append("null");
		}
			sb.append(",");
		if(null!=contract.getContractEndDate()
				&&!StringUtils.isBlank(contract.getContractEndDate())
				&&!StringUtils.isEmpty(contract.getContractEndDate())){
			sb.append("'");
			sb.append(contract.getContractEndDate());
			sb.append("'");
		}else{
			sb.append("null");
		}
			sb.append(",'")
			.append(contract.getAmt())
			.append("','")
			.append(contract.getPaymentTimes())
			.append("','")
			.append(contract.getComleteInvoiceNumber())
			.append("','")
			.append(contract.getCompleteInvoiceAmt())
			.append("','")
			.append(contract.getRemainInvoiceAmt())
			.append("','")
			.append(contract.getRemark())
			.append("')");
		getJdbcTempalte().execute(sb.toString());
		
	}
	
	@Override
	public void remove(Integer id) {
		String sql ="update t_contract set ABLED = 0 where id = ?";
		getJdbcTempalte().update(sql, new Object[]{id});
	}

	@Override
	public void update(Contract contract) {
		StringBuffer sb = new StringBuffer("update t_contract set ")
			.append("CONTRACT_TYPE = ? , ")
			.append("CONTRACT_TYPE= ? , ")
			.append("COMPANY_NAME_OF_FIRST= ? , ")
			.append("CONTACT_NAME_OF_FIRST= ? , ")
			.append("COMPANY_NAME_OF_SECOND= ? , ")
			.append("CONTACT_NAME_OF_SECOND= ? , ")
			.append("COMPANY_NAME_OF_THIRD= ? , ")
			.append("CONTACT_NAME_OF_THIRD= ? , ")
			.append("SALES= ? , ")
			.append("ITEM_NAME= ? , ")
			.append("CONTRACT_SIGN_DATE= ? , ")
			.append("CONTRACT_START_DATE= ? , ")
			.append("CONTRACT_END_DATE= ? , ")
			.append("AMT= ? , ")
			.append("PAYMENT_TIMES= ? , ")
			.append("COMPLETE_INVOICE_NUMBER= ? , ")
			.append("COMPLETE_INVOICE_AMT= ? , ")
			.append("REMAIN_INVOICE_AMT= ? , ")
			.append("REMARK= ? ")
			.append("where ID = ?");
		getJdbcTempalte().update(sb.toString(), new Object[]{
			contract.getContractId(),
			contract.getContractType(),
			contract.getCompanyNameOfFirst(),
			contract.getContactNameOfFirst(),
			contract.getCompanyNameOfSecond(),
			contract.getContactNameOfSecond(),
			contract.getCompanyNameOfThird(),
			contract.getContactNameOfThird(),
			contract.getContactNameOfSecond(),
			contract.getItemName(),
			DateUtils.dateNullUtil(contract.getContractSignDate()),
			DateUtils.dateNullUtil(contract.getContractStartDate()),
			DateUtils.dateNullUtil(contract.getContractEndDate()),
			contract.getAmt(),
			contract.getPaymentTimes(),
			contract.getComleteInvoiceNumber(),
			contract.getCompleteInvoiceAmt(),
			contract.getRemainInvoiceAmt(),
			contract.getRemark(),
			contract.getId()
		});
	}

	@Override
	public Contract find(Integer id) {
		String sql ="select * from t_contract where ID = ?";
		List<Contract> contractList = getJdbcTempalte().query(sql, new Object[]{id}, new RowMapper<Contract>(){

			@Override
			public Contract mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Contract contract =	new Contract();
				contract.setId(rs.getInt("ID"));
				contract.setContractId(rs.getString("CONTRACT_ID"));
				contract.setContractType(rs.getString("CONTRACT_TYPE"));
				contract.setCompanyNameOfFirst(rs.getString("COMPANY_NAME_OF_FIRST"));
				contract.setContactNameOfFirst(rs.getString("CONTACT_NAME_OF_FIRST"));
				contract.setCompanyNameOfSecond(rs.getString("COMPANY_NAME_OF_SECOND"));
				contract.setContactNameOfSecond(rs.getString("CONTACT_NAME_OF_SECOND"));
				contract.setCompanyNameOfThird(rs.getString("COMPANY_NAME_OF_THIRD"));
				contract.setContactNameOfThird(rs.getString("CONTACT_NAME_OF_THIRD"));
				contract.setSales(rs.getString("SALES"));
				contract.setItemName(rs.getString("ITEM_NAME"));
				contract.setContractSignDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_SIGN_DATE")));
				contract.setContractStartDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_START_DATE")));
				contract.setContractEndDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_END_DATE")));
				contract.setAmt(rs.getBigDecimal("AMT"));
				contract.setPaymentTimes(rs.getInt("PAYMENT_TIMES"));
				contract.setComleteInvoiceNumber(rs.getInt("COMPLETE_INVOICE_NUMBER"));
				contract.setCompleteInvoiceAmt(rs.getBigDecimal("COMPLETE_INVOICE_AMT"));
				contract.setRemainInvoiceAmt(rs.getBigDecimal("REMAIN_INVOICE_AMT"));
				contract.setRemark(rs.getString("REMARK"));
				return contract;
			}});
		if(null!=contractList&&contractList.size()>0){
			return contractList.get(0);
		}else
			return null;
	}

	@Override
	public Contract findByContractId(String ContractId,Integer userId) {
		String sql ="select * from t_contract where CONTRACT_ID = ? AND ABLED = 1 AND ID IN (SELECT CON_ID FROM T_COM_USER_CON WHERE USER_ID = ?)";
		List<Contract> contractList = getJdbcTempalte().query(sql, new Object[]{ContractId,userId}, new RowMapper<Contract>(){

			@Override
			public Contract mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Contract contract =	new Contract();
				contract.setId(rs.getInt("ID"));
				contract.setContractId(rs.getString("CONTRACT_ID"));
				contract.setContractType(rs.getString("CONTRACT_TYPE"));
				contract.setCompanyNameOfFirst(rs.getString("COMPANY_NAME_OF_FIRST"));
				contract.setContactNameOfFirst(rs.getString("CONTACT_NAME_OF_FIRST"));
				contract.setCompanyNameOfSecond(rs.getString("COMPANY_NAME_OF_SECOND"));
				contract.setContactNameOfSecond(rs.getString("CONTACT_NAME_OF_SECOND"));
				contract.setCompanyNameOfThird(rs.getString("COMPANY_NAME_OF_THIRD"));
				contract.setContactNameOfThird(rs.getString("CONTACT_NAME_OF_THIRD"));
				contract.setItemName(rs.getString("ITEM_NAME"));
				contract.setSales(rs.getString("SALES"));
				contract.setContractSignDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_SIGN_DATE")));
				contract.setContractStartDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_START_DATE")));
				contract.setContractEndDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_END_DATE")));
				contract.setAmt(rs.getBigDecimal("AMT"));
				contract.setPaymentTimes(rs.getInt("PAYMENT_TIMES"));
				contract.setComleteInvoiceNumber(rs.getInt("COMPLETE_INVOICE_NUMBER"));
				contract.setCompleteInvoiceAmt(rs.getBigDecimal("COMPLETE_INVOICE_AMT"));
				contract.setRemainInvoiceAmt(rs.getBigDecimal("REMAIN_INVOICE_AMT"));
				contract.setRemark(rs.getString("REMARK"));
				return contract;
			}});
		if(null!=contractList&&contractList.size()>0){
			return contractList.get(0);
		}else
			return null;
	}
	
	public List<Contract> findList(String contractName,String firstName,String signDateStart,String signDateEnd,Integer userId){
		//sql构建
		StringBuffer sb = new  StringBuffer("select * from t_contract where ID IN (select CON_ID FROM T_COM_USER_CON WHERE USER_ID = ? AND ABLED = 1) AND ABLED = 1 ");
		List<Object> params= new ArrayList<Object>();
		params.add(userId);
		if(null!=contractName
				&&!StringUtils.isBlank(contractName)
				&&!StringUtils.isEmpty(contractName)){
			sb.append("AND ITEM_NAME = ? ");
			params.add(contractName);
		}
		if(null!=firstName
				&&!StringUtils.isBlank(firstName)
				&&!StringUtils.isEmpty(firstName)){
			sb.append("AND COMPANY_NAME_OF_FIRST = ? ");
			params.add(firstName);
		}
		//起始时间不为空，终止时间为空
		if((null!=signDateStart
				&&!StringUtils.isBlank(signDateStart)
				&&!StringUtils.isEmpty(signDateStart))
				&&!(null!=signDateEnd
				&&!StringUtils.isBlank(signDateEnd)
				&&!StringUtils.isEmpty(signDateEnd))){
			sb.append("AND CONTRACT_SIGN_DATE >= ? ");
			params.add(signDateStart);
		}
		//起始时间为空，终止时间不为空
		if(!(null!=signDateStart
				&&!StringUtils.isBlank(signDateStart)
				&&!StringUtils.isEmpty(signDateStart))
				&&(null!=signDateEnd
				&&!StringUtils.isBlank(signDateEnd)
				&&!StringUtils.isEmpty(signDateEnd))){
			sb.append("AND CONTRACT_SIGN_DATE <= ? ");
			params.add(signDateEnd);
		}
		//起始时间为空且终止时间为空
		if((null!=signDateStart
				&&!StringUtils.isBlank(signDateStart)
				&&!StringUtils.isEmpty(signDateStart))
				&&(null!=signDateEnd
				&&!StringUtils.isBlank(signDateEnd)
				&&!StringUtils.isEmpty(signDateEnd))){
			sb.append("AND CONTRACT_SIGN_DATE BETWEEN ? AND ?");
			params.add(signDateStart);
			params.add(signDateEnd);
		}
		List<Contract> contractList = getJdbcTempalte().query(sb.toString(), params.toArray(), new RowMapper<Contract>(){

			@Override
			public Contract mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Contract contract =	new Contract();
				contract.setId(rs.getInt("ID"));
				contract.setContractId(rs.getString("CONTRACT_ID"));
				contract.setContractType(rs.getString("CONTRACT_TYPE"));
				contract.setCompanyNameOfFirst(rs.getString("COMPANY_NAME_OF_FIRST"));
				contract.setContactNameOfFirst(rs.getString("CONTACT_NAME_OF_FIRST"));
				contract.setCompanyNameOfSecond(rs.getString("COMPANY_NAME_OF_SECOND"));
				contract.setContactNameOfSecond(rs.getString("CONTACT_NAME_OF_SECOND"));
				contract.setCompanyNameOfThird(rs.getString("COMPANY_NAME_OF_THIRD"));
				contract.setContactNameOfThird(rs.getString("CONTACT_NAME_OF_THIRD"));
				contract.setSales(rs.getString("SALES"));
				contract.setItemName(rs.getString("ITEM_NAME"));
				contract.setContractSignDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_SIGN_DATE")));
				contract.setContractStartDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_START_DATE")));
				contract.setContractEndDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_END_DATE")));
				contract.setAmt(rs.getBigDecimal("AMT"));
				contract.setPaymentTimes(rs.getInt("PAYMENT_TIMES"));
				contract.setComleteInvoiceNumber(rs.getInt("COMPLETE_INVOICE_NUMBER"));
				contract.setCompleteInvoiceAmt(rs.getBigDecimal("COMPLETE_INVOICE_AMT"));
				contract.setRemainInvoiceAmt(rs.getBigDecimal("REMAIN_INVOICE_AMT"));
				contract.setRemark(rs.getString("REMARK"));
				return contract;
			}});
		if(null!=contractList&&contractList.size()>0){
			return contractList;
		}
		return null;
	}

	@Override
	public Contract findByContractId(String ContractId) {
		String sql ="select * from t_contract where CONTRACT_ID = ? AND ABLED = 1 ";
		List<Contract> contractList = getJdbcTempalte().query(sql, new Object[]{ContractId}, new RowMapper<Contract>(){

			@Override
			public Contract mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Contract contract =	new Contract();
				contract.setId(rs.getInt("ID"));
				contract.setContractId(rs.getString("CONTRACT_ID"));
				contract.setContractType(rs.getString("CONTRACT_TYPE"));
				contract.setCompanyNameOfFirst(rs.getString("COMPANY_NAME_OF_FIRST"));
				contract.setContactNameOfFirst(rs.getString("CONTACT_NAME_OF_FIRST"));
				contract.setCompanyNameOfSecond(rs.getString("COMPANY_NAME_OF_SECOND"));
				contract.setContactNameOfSecond(rs.getString("CONTACT_NAME_OF_SECOND"));
				contract.setCompanyNameOfThird(rs.getString("COMPANY_NAME_OF_THIRD"));
				contract.setContactNameOfThird(rs.getString("CONTACT_NAME_OF_THIRD"));
				contract.setItemName(rs.getString("ITEM_NAME"));
				contract.setSales(rs.getString("SALES"));
				contract.setContractSignDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_SIGN_DATE")));
				contract.setContractStartDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_START_DATE")));
				contract.setContractEndDate(DateUtils.dateParseToString(rs.getDate("CONTRACT_END_DATE")));
				contract.setAmt(rs.getBigDecimal("AMT"));
				contract.setPaymentTimes(rs.getInt("PAYMENT_TIMES"));
				contract.setComleteInvoiceNumber(rs.getInt("COMPLETE_INVOICE_NUMBER"));
				contract.setCompleteInvoiceAmt(rs.getBigDecimal("COMPLETE_INVOICE_AMT"));
				contract.setRemainInvoiceAmt(rs.getBigDecimal("REMAIN_INVOICE_AMT"));
				contract.setRemark(rs.getString("REMARK"));
				return contract;
			}});
		if(null!=contractList&&contractList.size()>0){
			return contractList.get(0);
		}else
			return null;
	}
}
