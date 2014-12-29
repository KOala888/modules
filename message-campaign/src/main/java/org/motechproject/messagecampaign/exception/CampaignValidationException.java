package org.motechproject.messagecampaign.exception;

public class CampaignValidationException extends RuntimeException {

    private static final long serialVersionUID = -8291734942414009017L;

    public CampaignValidationException(String message) {
        super(message);
    }

    public CampaignValidationException(String message, Exception ex) {
        super(message, ex);
    }
}
