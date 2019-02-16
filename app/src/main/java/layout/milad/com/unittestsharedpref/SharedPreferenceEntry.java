package layout.milad.com.unittestsharedpref;

import java.util.Calendar;

public class SharedPreferenceEntry {

    private final String mName;

    private final Calendar mDateOfBirth;

    private final String mEmail;

    public SharedPreferenceEntry(String name, Calendar dateOfBirth, String email) {
        mName = name;
        mDateOfBirth = dateOfBirth;
        mEmail = email;
    }

    public String getName() {
        return mName;
    }

    public Calendar getDateOfBirth() {
        return mDateOfBirth;
    }

    public String getEmail() {
        return mEmail;
    }
}