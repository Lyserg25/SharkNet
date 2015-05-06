package sharknet;

import net.sharkfw.knowledgeBase.PeerSTSet;

/**
 * Created by s0539720 on 29.04.2015.
 */
public interface ProfileKPApp {
    /**
     * Ask a peer or multiple peers to send their profiles
     * @param peers
     */
    public void ask4Profiles(PeerSTSet peers);

    /**
     * Ask all peers in the surrounding area for their profiles
     */
    public void ask4Profiles();

    /**
     * Send your profile to everyone in the surrounding area
     */
    public void sendMyProfile();

    /**
     * Send one (e.g. your own) or multiple profiles to one or multiple recipients
     * @param profiles
     * @param recipients
     */
    public void sendProfiles(PeerSTSet profiles, PeerSTSet recipients);
}
