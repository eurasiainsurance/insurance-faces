package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.SteeringWheelLocation.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.SteeringWheelLocation;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("SteeringWheelLocation")
@ApplicationScoped
public class SteeringWheelLocationBean implements ListingBean<SteeringWheelLocation> {

    @Override
    public SteeringWheelLocation[] getAll() {
	return values();
    }

    @Override
    public SteeringWheelLocation[] getSelectable() {
	return selectableValues();
    }

    @Override
    public SteeringWheelLocation[] getNonSelectable() {
	return nonSelectableValues();
    }
}