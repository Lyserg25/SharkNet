package net.sharkfw.apps.sharknet;
/**
 *
 * @author s0539720
 */
public interface ProfileKP  {
    public void doExpose(SharkCS interest, KEPConnection kepConnection);
    
    public void doInsert(Knowledge k, KEPConnection kepConnection);
    
    /**
     * Ask a certain peer to send his/her profil
     * @param peer 
     */
    public void ask4Profile(PeerSemanticTag peer);
    
    /**
     * Ask multiple peers for their profiles
     * @param peers 
     */
    public void ask4Profiles(PeerSTSet peers);
    
    /**
     * Ask all peers in the surrounding area for their profiles
     */
    public void ask4Profiles();
    
    /**
     * Send your own profile or the profile of someone else to a certain recipient
     * @param profileCP
     * @param recipient 
     */
    public void sendProfile(ContextPoint profileCP, PeerSemanticTag recipient);
    
    /**
     * Send your own profile or the profile of someone else to multiple recipients
     * @param profileCP
     * @param recipients 
     */
    public void sendProfile(ContextPoint profileCP, PeerSTSet recipients);
    
    /**
     * Send your profile to everyone in the surrounding area
     */
    public void sendProfile();
    
    /**
     * Send multiple profiles to a certain recipient
     * @param profileCPs
     * @param recipient 
     */
    public void sendProfiles(ContextPoint[] profileCPs, PeerSemanticTag recipient);
    
    /**
     * Send multiple profiles to multiple recipients
     * @param profileCPs
     * @param recipients 
     */
    public void sendProfiles(ContextPoint[] profileCPs, PeerSTSet recipients);
    
    /**
     * Save a received profile to your knowledge base
     * @param profileCP 
     */
    public void saveProfile(ContextPoint profileCP);
    
    /**
     * Delete a profile from your knowledge base
     * @param profileCP 
     */
    public void deleteProfile(ContextPoint profileCP);
    
    /**
     *  Add a peer to a contact list.
     * @param peer
     * @param contactList 
     */
    public void addPeer2ContactList(PeerSemanticTag peer, PeerSTSet contactList);
    
    /**
     * Delete a peer from a contact list
     * @param peer
     * @param contactList 
     */
    public void deletePeerFromContactList(PeerSemanticTag peer, PeerSTSet contactList);
    
    /**
     * Check when a peer profile was updated last and if you have the current version
     * @param profile 
     */
    public void check4Update(PeerSemanticTag profile);
    
    /**
     * Check when peer profiles (e.g. all profiles in a contact list) were updated last and if you have the current version
     * @param profiles 
     */
    public void check4Update(PeerSTSet profiles);
}
