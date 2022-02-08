
package com.sem8.stayfit.WalkandStep;

import android.content.pm.PackageManager;

import com.sem8.stayfit.WalkandStep.services.AbstractStepDetectorService;
import com.sem8.stayfit.WalkandStep.services.AccelerometerStepDetectorService;
import com.sem8.stayfit.WalkandStep.services.HardwareStepDetectorService;
import com.sem8.stayfit.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
