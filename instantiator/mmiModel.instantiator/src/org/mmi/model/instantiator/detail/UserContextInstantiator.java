package org.mmi.model.instantiator.detail;

import org.carim.model.EducationLevelT;
import org.carim.model.GenderT;
import org.carim.model.PreviousExperienceT;
import org.carim.model.UserAttitude;
import org.carim.model.UserData;
import org.carim.model.UserRatings;
import org.mmi.events.UserAttitudeUpdateEvent;
import org.mmi.events.UserMoodUpdateEvent;
import org.mmi.events.UserRatingsUpdateEvent;
import org.mmi.events.event_t;
import org.mmi.model.instantiator.InstantiationContext;
import org.mmi.model.instantiator.InstantiatorBase;

public class UserContextInstantiator extends InstantiatorBase {

	public UserContextInstantiator(InstantiationContext c) {
		super(c);
	}

	public void updateUserData(int age, GenderT gender, EducationLevelT educationLevel, 
			PreviousExperienceT previousExperience){
		// this object is already created
		// fill the object
		icontext_.getTrial().getUserData().setAge(age);
		icontext_.getTrial().getUserData().setGender(gender);
		icontext_.getTrial().getUserData().setEducationLevel(educationLevel);
		icontext_.getTrial().getUserData().setPreviousExperience(previousExperience);
		// save the object in the model (not necessary)
	}

	public void updateUserRatings(float practical, float predictable,
			float clearlyStructured, float simple, float stylish,
			float premium, float creative, float captivating,
			float beautiful, float good){
		// create a new object
		UserRatings ur = icontext_.mfact.createUserRatings();
		// fill the object
		ur.setPractical(practical);
		ur.setPredictable(predictable);
		ur.setClearlyStructured(clearlyStructured);
		ur.setSimple(simple);
		ur.setStylish(stylish);
		ur.setPremium(premium);
		ur.setCreative(creative);
		ur.setCaptivating(captivating);
		ur.setBeautiful(beautiful);
		ur.setGood(good);
		// save the object in the model
		icontext_.getTrial().getUserData().getUserRatings().add(ur);
	}

	public void updateUserAttitude(float usefulness, float pleasantness,
			float integration, float selfEfficacy, float comfort){
		// create a new object
		UserAttitude u = icontext_.mfact.createUserAttitude();
		// fill the object
		u.setUsefulness(usefulness);
		u.setPleasantness(pleasantness);
		u.setIntegration(integration);
		u.setSelfEfficacy(selfEfficacy);
		u.setComfort(comfort);
		// save the object in the model
		icontext_.getTrial().getUserData().setUserAttitude(u);
	}

	public void updateUserMood(float mood){
		// create a new object (not necessary)
		// fill the object (not necessary)
		// save the object in the model
		icontext_.getTrial().getUserData().getUserMood().add(mood);
	}

}
