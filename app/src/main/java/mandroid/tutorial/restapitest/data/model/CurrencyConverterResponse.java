
package mandroid.tutorial.restapitest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyConverterResponse {

    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("base_currency_code")
    @Expose
    private String baseCurrencyCode;
    @SerializedName("base_currency_name")
    @Expose
    private String baseCurrencyName;
    @SerializedName("rates")
    @Expose
    private Rates rates;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("updated_date")
    @Expose
    private String updatedDate;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getBaseCurrencyName() {
        return baseCurrencyName;
    }

    public void setBaseCurrencyName(String baseCurrencyName) {
        this.baseCurrencyName = baseCurrencyName;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

}
