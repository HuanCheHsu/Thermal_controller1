package itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd;

import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;
public class ThermoSetX19 implements Thermostat {
    private int tem;
    private ControllerInterface controlthermostat;
    public ThermoSetX19(){
        FrontEnd n=new FrontEnd(this);
        n.pack();n.setVisible(true);
        n.setLocation(300,0);
        }
    @Override 
    public void newTemperature(int i) {
        this.tem=i;
    }
	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enable() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		return this.controlthermostat;
	}
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setController(ControllerInterface controllerInterface) {
		// TODO Auto-generated method stub
		this.controlthermostat=controllerInterface;
	}
	@Override
	public void setID(String arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getReading() {
		// TODO Auto-generated method stub
		return tem;
	}
}