package model42

import datatypes42.Percentage
import groovy.beans.Bindable

@Bindable
class PresentationModel42 {

	public final static String SLIDER_MIN_VALUE = "sliderMinValue"
	volatile int sliderMinValue = 0
	public final static String SLIDER_MAX_VALUE = "sliderMaxValue"
	volatile int sliderMaxValue = 16
	public final static String SLIDER_VALUE = "sliderValue"
	volatile int sliderValue = 1
	public final static String SLIDER_ENABLED = "sliderEnabled"
	volatile boolean sliderEnabled = true
	public final static String AUTO_SLIDER_CHECKBOX_SELECTED = "autoSliderCheckboxSelected"
	volatile boolean autoSliderCheckboxSelected = true
	public final static String AUTO_SLIDER_CHECKBOX_ENABLED = "autoSliderCheckboxEnabled"
	volatile boolean autoSliderCheckboxEnabled = true
	public final static String AUTO_SLIDER_LOWER_LIMIT = "autoSliderLowerLimit"
	volatile int autoSliderLowerLimit = 2
	public final static String AUTO_SLIDER_UPPER_LIMIT = "autoSliderUpperLimit"
	volatile int autoSliderUpperLimit = 10
	public final static String DO_PAINT_AUTO_SLIDER_RANGE = "doPaintAutoSliderRange"
	volatile boolean doPaintAutoSliderRange = true

	public final static String CPU_LOAD_SETPOINT_PERCENTAGE = "cpuLoadSetpointPercentage"
	volatile Percentage cpuLoadSetpointPercentage = Percentage.fromNumber(80)
	public final static String ADJUST_INTERVAL_SECONDS = "adjustIntervalSeconds"
	volatile int adjustIntervalSeconds = 60

	public final static String ACTUAL_NUMBER_OF_WORKERS = "actualNumberOfWorkers"
	volatile int actualNumberOfWorkers = 0
}
