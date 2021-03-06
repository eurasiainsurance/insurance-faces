package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuredAgeAndExpirienceClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuredAgeAndExpirienceClass;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuredAgeAndExpirienceClass")
@ApplicationScoped
public class InsuredAgeAndExpirienceClassCDIBean implements ListingBean<InsuredAgeAndExpirienceClass> {

    @Override
    public InsuredAgeAndExpirienceClass[] getAll() {
	return values();
    }

    @Override
    public InsuredAgeAndExpirienceClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuredAgeAndExpirienceClass[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public InsuredAgeAndExpirienceClass byName(String name) {
	return InsuredAgeAndExpirienceClass.valueOf(name);
    }
}
