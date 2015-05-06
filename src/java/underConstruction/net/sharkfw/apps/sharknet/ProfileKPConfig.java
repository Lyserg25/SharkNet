package sharknet;

/**
 * Created by s0539720 on 29.04.2015.
 */
public interface ProfileKPConfig {
    /**
     * Configuration to determine whether unverified messages are accepted
     * @param acceptWithoutVerification
     */
    public void setAcceptWithoutVerification(boolean acceptWithoutVerification);
    public boolean getAcceptWithoutVerification();

    /**
     * Configuration to determine whether profiles should be sent to an unknown peer
     * @param sendProfiles2UnknownPeer
     */
    public void setSendProfiles2UnknownPeer(boolean sendProfiles2UnknownPeer);
    public boolean getSendProfiles2UnknownPeer();

    /**
     * Configuration to determine whether the users own profile is sent automatically when a peer asks for a
     * profile
     * @param sendProfileAutomaticallyOnProfileRequest
     */
    public void setSendProfileAutomaticallyOnProfileRequest(boolean sendProfileAutomaticallyOnProfileRequest);
    public boolean getSendProfileAutomaticallyOnProfileRequest();

    /**
     * Configuration to determine whether the users own profile is sent automatically when the user receives a profile
     * from a peer
     * @param sendProfileAutomaticallyOnProfileReception
     */
    public void setSendProfileAutomaticallyOnProfileReception(boolean sendProfileAutomaticallyOnProfileReception);
    public boolean getSendProfileAutomaticallyOnProfileReception();

    /**
     * Configuration to determine whether the peer that requests a profile from the user is asked for his profile
     * as well automatically
     * @param ask4ProfileAutomaticallyOnProfileRequest
     */
    public void setAsk4ProfileAutomaticallyOnProfileRequest(boolean ask4ProfileAutomaticallyOnProfileRequest);
    public boolean getAst4ProfileAutomaticallyOnProfileRequest();

    /**
     * Configuration to determine whether the peer that sends a profile to the user is asked for his profile
     * as well automatically, unless it already is his/her profile that was sent
     * @param ask4ProfileAutomaticallyOnProfileReception
     */
    public void setAsk4ProfileAutomaticallyOnProfileReception(boolean ask4ProfileAutomaticallyOnProfileReception);
    public boolean getAst4ProfileAutomaticallyOnProfileReception();

    /**
     * Configuration to determine whether the peer that requests a profile from the user is asked for all of
     * his profiles automatically
     * @param ask4ProfilesAutomaticallyOnProfileRequest
     */
    public void setAsk4ProfilesAutomaticallyOnProfileRequest(boolean ask4ProfilesAutomaticallyOnProfileRequest);
    public boolean getAst4ProfilesAutomaticallyOnProfileRequest();

    /**
     * Configuration to determine whether the peer that sends a profile to the user is asked for all of his profiles
     * automatically
     * @param ask4ProfilesAutomaticallyOnProfileReception
     */
    public void setAsk4ProfilesAutomaticallyOnProfileReception(boolean ask4ProfilesAutomaticallyOnProfileReception);
    public boolean getAst4ProfilesAutomaticallyOnProfileReception();

    /**
     * Configuration whether a profile should be accepted if the owner is someone else than the person that the
     * profile is of
     * @param acceptProfileWithDifferentOwner
     */
    public void setAcceptProfileWithDifferentOwner(boolean acceptProfileWithDifferentOwner);
    public boolean getAcceptProfileWithDifferentOwner();
}
