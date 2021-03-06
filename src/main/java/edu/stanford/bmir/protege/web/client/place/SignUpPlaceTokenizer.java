package edu.stanford.bmir.protege.web.client.place;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 19/02/16
 */
public class SignUpPlaceTokenizer implements WebProtegePlaceTokenizer<SignUpPlace> {

    private static final String ACCOUNTS_NEW = "accounts/new";

    @Override
    public boolean matches(String token) {
        return ACCOUNTS_NEW.equals(token);
    }

    @Override
    public Class<SignUpPlace> getPlaceClass() {
        return SignUpPlace.class;
    }

    @Override
    public SignUpPlace getPlace(String token) {
        return new SignUpPlace();
    }

    @Override
    public String getToken(SignUpPlace place) {
        return ACCOUNTS_NEW;
    }
}
