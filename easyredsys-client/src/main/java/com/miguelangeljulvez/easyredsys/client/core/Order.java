package com.miguelangeljulvez.easyredsys.client.core;

import com.miguelangeljulvez.easyredsys.client.util.CofType;
import sis.redsys.api.ApiMacSha256;

import javax.xml.bind.annotation.XmlElement;

public abstract class Order {

    protected final static String ds_SignatureVersion = "HMAC_SHA256_V1";

    protected final ApiMacSha256 apiMacSha256 = new ApiMacSha256();

    public Order() {
        //Inicializamos por no tocar las librerías de redsys
        apiMacSha256.setParameter("DS_MERCHANT_AMOUNT", "");
        apiMacSha256.setParameter("DS_MERCHANT_ORDER", "");
        apiMacSha256.setParameter("DS_MERCHANT_MERCHANTCODE", "");
        apiMacSha256.setParameter("DS_MERCHANT_TERMINAL", "");
        apiMacSha256.setParameter("DS_MERCHANT_CURRENCY", "");
        apiMacSha256.setParameter("DS_MERCHANT_TRANSACTIONTYPE", "");
        apiMacSha256.setParameter("DS_MERCHANT_PRODUCTDESCRIPTION", "");
        apiMacSha256.setParameter("DS_MERCHANT_TITULAR", "");
        apiMacSha256.setParameter("DS_MERCHANT_MERCHANTDATA", "");
    }

    public String getDs_SignatureVersion() {
        return ds_SignatureVersion;
    }

    @XmlElement(name = "DS_MERCHANT_AMOUNT")
    public long getDs_merchant_amount() {
        try {
            return (Long.valueOf(apiMacSha256.getParameter("DS_MERCHANT_AMOUNT")));
        } catch (NumberFormatException e) {
        }

        return 0;
    }

    public void setDs_merchant_amount(long ds_merchant_amount) {
        apiMacSha256.setParameter("DS_MERCHANT_AMOUNT", String.valueOf(ds_merchant_amount));
    }

    @XmlElement(name = "DS_MERCHANT_ORDER")
    public String getDs_merchant_order() {
        return apiMacSha256.getParameter("DS_MERCHANT_ORDER");
    }

    public void setDs_merchant_order(String ds_merchant_order) {
        apiMacSha256.setParameter("DS_MERCHANT_ORDER", String.valueOf(ds_merchant_order));
    }

    @XmlElement(name = "DS_MERCHANT_MERCHANTCODE")
    public long getDs_merchant_merchantcode() {
        try {
            return Long.valueOf(apiMacSha256.getParameter("DS_MERCHANT_MERCHANTCODE"));
        } catch (NumberFormatException e) {
        }

        return -1;
    }

    public void setDs_merchant_merchantcode(long ds_merchant_merchantcode) {
        apiMacSha256.setParameter("DS_MERCHANT_MERCHANTCODE", String.valueOf(ds_merchant_merchantcode));
    }

    @XmlElement(name = "DS_MERCHANT_TERMINAL")
    public long getDs_merchant_terminal() {
        try {
            return Long.valueOf(apiMacSha256.getParameter("DS_MERCHANT_TERMINAL"));
        } catch (NumberFormatException e) {
        }

        return 0;
    }

    public void setDs_merchant_terminal(long ds_merchant_terminal) {
        apiMacSha256.setParameter("DS_MERCHANT_TERMINAL", String.valueOf(ds_merchant_terminal));
    }

    @XmlElement(name = "DS_MERCHANT_CURRENCY")
    public long getDs_merchant_currency() {
        try {
            return Long.valueOf(apiMacSha256.getParameter("DS_MERCHANT_CURRENCY"));
        } catch (NumberFormatException e) {
        }

        return 0;
    }

    public void setDs_merchant_currency(long ds_merchant_currency) {
        apiMacSha256.setParameter("DS_MERCHANT_CURRENCY", String.valueOf(ds_merchant_currency));
    }

    @XmlElement(name = "DS_MERCHANT_TRANSACTIONTYPE")
    public String getDs_merchant_transactiontype() {
        return apiMacSha256.getParameter("DS_MERCHANT_TRANSACTIONTYPE");
    }

    public void setDs_merchant_transactiontype(String ds_merchant_transactiontype) {
        apiMacSha256.setParameter("DS_MERCHANT_TRANSACTIONTYPE", ds_merchant_transactiontype);
    }

    @XmlElement(name = "DS_MERCHANT_PRODUCTDESCRIPTION")
    public String getDs_merchant_productdescription() {
        return apiMacSha256.getParameter("DS_MERCHANT_PRODUCTDESCRIPTION");
    }

    public void setDs_merchant_productdescription(String ds_merchant_productdescription) {
        apiMacSha256.setParameter("DS_MERCHANT_PRODUCTDESCRIPTION", ds_merchant_productdescription);
    }

    @XmlElement(name = "DS_MERCHANT_TITULAR")
    public String getDs_merchant_titular() {
        return apiMacSha256.getParameter("DS_MERCHANT_TITULAR");
    }

    public void setDs_merchant_titular(String ds_merchant_titular) {
        apiMacSha256.setParameter("DS_MERCHANT_TITULAR", ds_merchant_titular);
    }

    @XmlElement(name = "DS_MERCHANT_MERCHANTDATA")
    public String getDs_merchant_merchantdata() {
        return apiMacSha256.getParameter("DS_MERCHANT_MERCHANTDATA");
    }

    public void setDs_merchant_merchantdata(String ds_merchant_merchantdata) {
        apiMacSha256.setParameter("DS_MERCHANT_MERCHANTDATA", ds_merchant_merchantdata);
    }

    @XmlElement(name = "DS_MERCHANT_IDENTIFIER")
    public String getDs_merchant_identifier() {
        return apiMacSha256.getParameter("DS_MERCHANT_IDENTIFIER");
    }

    public void setDs_merchant_identifier(String ds_merchant_identifier) {
        apiMacSha256.setParameter("DS_MERCHANT_IDENTIFIER", ds_merchant_identifier);
    }

    @XmlElement(name = "DS_MERCHANT_GROUP")
    public String getDs_merchant_group() {
        return apiMacSha256.getParameter("DS_MERCHANT_GROUP");
    }

    public void setDs_merchant_group(String ds_merchant_group) {
        apiMacSha256.setParameter("DS_MERCHANT_GROUP", ds_merchant_group);
    }

    @XmlElement(name = "DS_MERCHANT_DIRECTPAYMENT")
    public String getDs_merchant_directpayment() {
        return apiMacSha256.getParameter("DS_MERCHANT_DIRECTPAYMENT");
    }

    public void setDs_merchant_directpayment(boolean ds_merchant_directpayment) {
        apiMacSha256.setParameter("DS_MERCHANT_DIRECTPAYMENT", ds_merchant_directpayment ? "true" : "false");
    }

    @XmlElement(name = "DS_MERCHANT_COF_INI")
    public String getDs_merchant_cof_ini() {
        return apiMacSha256.getParameter("DS_MERCHANT_COF_INI");
    }

    public void setDs_merchant_cof_ini(boolean ds_merchant_cof_ini) {
        apiMacSha256.setParameter("DS_MERCHANT_COF_INI", ds_merchant_cof_ini ? "S" : "N");
    }

    @XmlElement(name = "DS_MERCHANT_COF_TYPE")
    public String getDs_merchant_cof_type() {
        return apiMacSha256.getParameter("DS_MERCHANT_COF_TYPE");
    }

    public void setDs_merchant_cof_type(CofType ds_merchant_cof_type) {
        apiMacSha256.setParameter("DS_MERCHANT_COF_TYPE", ds_merchant_cof_type == null ? "" : ds_merchant_cof_type.getCode());
    }

    @XmlElement(name = "DS_MERCHANT_COF_TXNID")
    public String getDs_merchant_cof_txnid() {
        return apiMacSha256.getParameter("DS_MERCHANT_COF_TXNID");
    }

    public void setDs_merchant_cof_txnid(String ds_merchant_cof_txnid) {
        apiMacSha256.setParameter("DS_MERCHANT_COF_TXNID", ds_merchant_cof_txnid);
    }

    @XmlElement(name = "DS_MERCHANT_EXCEP_SCA")
    public String getDs_merchant_excep_sca() {
        return apiMacSha256.getParameter("DS_MERCHANT_EXCEP_SCA");
    }

    public void setDs_merchant_excep_sca(String ds_merchant_excep_sca) {
        apiMacSha256.setParameter("DS_MERCHANT_EXCEP_SCA", ds_merchant_excep_sca);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("DS_MERCHANT_AMOUNT:");
        sb.append(getDs_merchant_amount());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_ORDER:");
        sb.append(getDs_merchant_order());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_MERCHANTCODE:");
        sb.append(getDs_merchant_merchantcode());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_TERMINAL:");
        sb.append(getDs_merchant_terminal());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_CURRENCY:");
        sb.append(getDs_merchant_currency());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_TRANSACTIONTYPE:");
        sb.append(getDs_merchant_transactiontype());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_PRODUCTDESCRIPTION:");
        sb.append(getDs_merchant_productdescription());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_TITULAR:");
        sb.append(getDs_merchant_titular());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_MERCHANTDATA:");
        sb.append(getDs_merchant_merchantdata());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_IDENTIFIER:");
        sb.append(getDs_merchant_identifier());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_GROUP:");
        sb.append(getDs_merchant_group());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_DIRECTPAYMENT:");
        sb.append(getDs_merchant_directpayment());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_COF_INI:");
        sb.append(getDs_merchant_cof_ini());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_COF_TYPE:");
        sb.append(getDs_merchant_cof_type());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_COF_TXNID:");
        sb.append(getDs_merchant_cof_txnid());
        sb.append(System.lineSeparator());
        sb.append("DS_MERCHANT_EXCEP_SCA:");
        sb.append(getDs_merchant_excep_sca());
        sb.append(System.lineSeparator());

        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        boolean isEquals = false;
        if (object instanceof Order) {
            Order order = (Order) object;

            if (order.getDs_merchant_order() != null && order.getDs_merchant_order().equals(this.getDs_merchant_order())) {
                isEquals = true;
            }
        }
        return isEquals;
    }

}
