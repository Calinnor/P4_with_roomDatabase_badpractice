package com.lamzone.mareunion.di;

import com.lamzone.mareunion.model.services.ApiMeeting;
import com.lamzone.mareunion.model.services.ApiPlace;
import com.lamzone.mareunion.model.services.MeetingService;
import com.lamzone.mareunion.model.services.PlaceService;

/**
 * create instance of FakeMeetingService using ApiService service//local plutot que fake
 */
public class DI {

    /**
     * implemente FakeApi
     */
    private static ApiMeeting mMeetingApi = new MeetingService();
    private static ApiPlace mApiPlace = new PlaceService();

    /**
     * @return an instance of FakeApi. Usable in app to collect values
     */
    public static ApiMeeting getMeetingApi() {
        return mMeetingApi;
    }

    public static ApiPlace getApiPlace() {
        return mApiPlace;
    }

    /**
     * @return a new instance of DummyMeetingService. Usable with tests
     */
    public static ApiMeeting getNewInstanceApi() {
        return new MeetingService();
    }

    public static ApiPlace getNewInstancePlaceApi() {
        return new PlaceService();
    }
}
