package org.pedromateo.umulandertest;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.carim.model.*;
import org.mmi.android.instrumentation.ContextDescription.Communication.*;
import org.mmi.android.instrumentation.ContextDescription.Device.*;
import org.mmi.android.instrumentation.ContextDescription.LocationTime.*;
import org.mmi.android.instrumentation.ContextDescription.PhysicalEnvironment.*;
import org.mmi.android.instrumentation.ContextDescription.SocialContext.*;
import org.mmi.android.instrumentation.ContextDescription.User.*;

public class AHE16ToCarimConverter {

	public static WeatherT convert(Weather value){
		switch(value){
		case WEATHER_CLOUDY: 
			return WeatherT.CLOUDY;
		case WEATHER_RAINY: 
			return WeatherT.RAINY;
		case WEATHER_SNOWY: 
			return WeatherT.SNOWY;
		case WEATHER_SUNNY: 
			return WeatherT.SUNNY;
		case WEATHER_WINDY: 
			return WeatherT.WINDY;
		default:
			return WeatherT.NONE;
		}
	}

	public static GenderT convert(Gender value){
		switch(value){
		case GENDER_FEMALE: 
			return GenderT.FEMALE;
		case GENDER_MALE: 
			return GenderT.MALE;
		case GENDER_OTHER: 
			return GenderT.OTHER;
		default:
			return GenderT.NONE;
		}
	}

	public static EducationLevelT convert(EducationLevel value){
		switch(value){
		case EDUCATION_COLLEGE: 
			return EducationLevelT.COLLEGE;
		case EDUCATION_HIGHSCHOOL: 
			return EducationLevelT.HIGHSCHOOL;
		case EDUCATION_PROFESSIONAL: 
			return EducationLevelT.PROFESSIONAL;
		case EDUCATION_NOT_APPLICABLE: 
			return EducationLevelT.NOTAPPLICABLE;
		default:
			return EducationLevelT.NONE;
		}
	}

	public static PreviousExperienceT convert(PreviousExperience value){
		switch(value){
		case PREEXPERIENCE_LOW: 
			return PreviousExperienceT.LOW;
		case PREEXPERIENCE_MEDIUM: 
			return PreviousExperienceT.MEDIUM;
		case PREEXPERIENCE_HIGH: 
			return PreviousExperienceT.HIGH;
		case PREEXPERIENCE_EXPERT: 
			return PreviousExperienceT.EXPERT;
		default:
			return PreviousExperienceT.NONE;
		}
	}

	public static SocialCompanyT convert(SocialCompany value){
		switch(value){
		case COMPANY_ALONE: 
			return SocialCompanyT.ALONE;
		case COMPANY_WITH_A_PERSON: 
			return SocialCompanyT.WITHAPERSON;
		case COMPANY_WITH_A_GROUP: 
			return SocialCompanyT.WITHAGROUP;
		default:
			return SocialCompanyT.NONE;
		}
	}

	public static SocialArenaT convert(SocialArena value){
		switch(value){
		case ARENA_DOMESTIC: 
			return SocialArenaT.DOMESTIC;
		case ARENA_EDUCATIONAL: 
			return SocialArenaT.EDUCATIONAL;
		case ARENA_LEISURE: 
			return SocialArenaT.LEISURE;
		case ARENA_WORK: 
			return SocialArenaT.WORK;
		default:
			return SocialArenaT.NONE;
		}
	}

	public static LocationT convert(UserLocation value){
		switch(value){
		case USER_LOCATION_HOME: 
			return LocationT.HOME;
		case USER_LOCATION_OFFICE_SCHOOL: 
			return LocationT.OFFICESCHOOL;
		case USER_LOCATION_OTHER_INDOOR: 
			return LocationT.OTHERINDOOR;
		case USER_LOCATION_OTHER_OUTDOOR: 
			return LocationT.OTHEROUTDOOR;
		case USER_LOCATION_STREET: 
			return LocationT.STREET;
		default:
			return LocationT.NONE;
		}
	}

	public static MobilityLevelT convert(MobilityLevel value){
		switch(value){
		case MOBILITY_DRIVING: 
			return MobilityLevelT.DRIVING;
		case MOBILITY_OTHER: 
			return MobilityLevelT.OTHER;
		case MOBILITY_SITTING: 
			return MobilityLevelT.SITTING;
		case MOBILITY_SPORTING: 
			return MobilityLevelT.SPORTING;
		case MOBILITY_STANDING: 
			return MobilityLevelT.STANDING;
		case MOBILITY_WALKING: 
			return MobilityLevelT.WALKING;
		default:
			return MobilityLevelT.NONE;
		}
	}

	public static DeviceTypeT convert(DeviceType value){
		switch(value){
		case DEVICE_LAPTOP: 
			return DeviceTypeT.LAPTOP;
		case DEVICE_MMPLAYER: 
			return DeviceTypeT.MMPLAYER;
		case DEVICE_OTHER: 
			return DeviceTypeT.OTHER;
		case DEVICE_SMARTPHONE: 
			return DeviceTypeT.SMARTPHONE;
		case DEVICE_TABLET: 
			return DeviceTypeT.TABLET;
		default:
			return DeviceTypeT.NONE;
		}
	}

	public static ScreenSizeT convert(ScreenSize value){
		switch(value){
		case SCREEN_SIZE_SMALL: 
			return ScreenSizeT.SMALL_LET4IN;
		case SCREEN_SIZE_NORMAL: 
			return ScreenSizeT.MEDIUM_BT4IN10IN;
		case SCREEN_SIZE_LARGE: 
			return ScreenSizeT.LARGE_GET10IN;
		default:
			return ScreenSizeT.NONE;
		}
	}

	public static ScreenResolutionT convert(ScreenResolution value){
		switch(value){
		case SCREEN_RESOLUTION_SMALL: 
			return ScreenResolutionT.SMALL_LET480X800;
		case SCREEN_RESOLUTION_NORMAL: 
			return ScreenResolutionT.MEDIUM_BT480X8001280X800;
		case SCREEN_RESOLUTION_LARGE: 
			return ScreenResolutionT.LARGE_GET1280X800;
		default:
			return ScreenResolutionT.NONE;
		}
	}

	public static ScreenOrientationT convert(ScreenOrientation value){
		switch(value){
		case ORIENTATION_LANDSCAPE: 
			return ScreenOrientationT.LANDSCAPE;
		case ORIENTATION_PORTRAIT: 
			return ScreenOrientationT.PORTRAIT;
		default:
			return ScreenOrientationT.NONE;
		}
	}

	public static WirelessAccessTypeT convert(WirelessAccessType value){
		switch(value){
		case WIRELESS_ACCESS_TYPE_BLUETOOTH: 
			return WirelessAccessTypeT.BLUETOOTH;
		case WIRELESS_ACCESS_TYPE_MOBILE: 
			return WirelessAccessTypeT.MOBILE;
		case WIRELESS_ACCESS_TYPE_WIFI: 
			return WirelessAccessTypeT.WIFI;
		default:
			return WirelessAccessTypeT.NOACCESS;
		}
	}

	//public static xxx convert( value){}

}
