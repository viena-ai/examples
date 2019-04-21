package com.viena.examples.demographicanalytics;

import com.viena.api.demographic.DemographicData;
import com.viena.api.demographic.DemographicDataAdapter;
import com.viena.api.demographic.FootfallAnalytics;

import java.io.File;

public class FootfallExample {
    public static void main(String[] args) {
        FootfallAnalytics footfallAnalytcs = new FootfallAnalytics();
        String videoFilePath = "";
        File videoFile = new File(videoFilePath);
        footfallAnalytcs.uploadVideo(videoFile, new DemographicDataAdapter() {
            public void detailedAnalytics(DemographicData demographicData) {
                System.out.println("FootfallExample -"+demographicData.toString());
            }

            public void summaryAnalytics(DemographicData demographicData) {

            }
        });
    }
}

