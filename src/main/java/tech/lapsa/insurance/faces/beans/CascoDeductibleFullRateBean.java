package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.CascoDeductibleFullRate.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.CascoDeductibleFullRate;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("CascoDeductibleFullRate")
@ApplicationScoped
public class CascoDeductibleFullRateBean implements ListingBean<CascoDeductibleFullRate> {

    @Override
    public CascoDeductibleFullRate[] getAll() {
	return values();
    }

    @Override
    public CascoDeductibleFullRate[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CascoDeductibleFullRate[] getNonSelectable() {
	return nonSelectableValues();
    }
}