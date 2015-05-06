package sharknet;

import net.sharkfw.knowledgeBase.Knowledge;
import net.sharkfw.knowledgeBase.PeerSTSet;
import net.sharkfw.knowledgeBase.PeerSemanticTag;
import net.sharkfw.knowledgeBase.SharkCS;
import net.sharkfw.peer.KEPConnection;
import net.sharkfw.peer.KnowledgePort;
import net.sharkfw.peer.SharkEngine;

/**
 * Created by _Wayne- on 05.05.2015.
 */
public class ProfileKP extends KnowledgePort implements ProfileKPApp, ProfileKPConfig {
    private final PeerSemanticTag owner;

    public ProfileKP(SharkEngine se, PeerSemanticTag owner){
        super(se);
        this.owner = owner;
    }

    @Override
    protected void doExpose(SharkCS interest, KEPConnection kepConnection) {
        //
    }

    @Override
    protected void doInsert(Knowledge knowledge, KEPConnection kepConnection) {

    }

    @Override
    public void ask4Profiles(PeerSTSet peers) {

    }

    @Override
    public void ask4Profiles() {

    }

    @Override
    public void sendMyProfile() {

    }

    @Override
    public void sendProfiles(PeerSTSet profiles, PeerSTSet recipients) {

    }

    @Override
    public void setAcceptWithoutVerification(boolean acceptWithoutVerification) {

    }

    @Override
    public boolean getAcceptWithoutVerification() {
        return false;
    }

    @Override
    public void setSendProfiles2UnknownPeer(boolean sendProfiles2UnknownPeer) {

    }

    @Override
    public boolean getSendProfiles2UnknownPeer() {
        return false;
    }

    @Override
    public void setSendProfileAutomaticallyOnProfileRequest(boolean sendProfileAutomaticallyOnProfileRequest) {

    }

    @Override
    public boolean getSendProfileAutomaticallyOnProfileRequest() {
        return false;
    }

    @Override
    public void setSendProfileAutomaticallyOnProfileReception(boolean sendProfileAutomaticallyOnProfileReception) {

    }

    @Override
    public boolean getSendProfileAutomaticallyOnProfileReception() {
        return false;
    }

    @Override
    public void setAsk4ProfileAutomaticallyOnProfileRequest(boolean ask4ProfileAutomaticallyOnProfileRequest) {

    }

    @Override
    public boolean getAst4ProfileAutomaticallyOnProfileRequest() {
        return false;
    }

    @Override
    public void setAsk4ProfileAutomaticallyOnProfileReception(boolean ask4ProfileAutomaticallyOnProfileReception) {

    }

    @Override
    public boolean getAst4ProfileAutomaticallyOnProfileReception() {
        return false;
    }

    @Override
    public void setAsk4ProfilesAutomaticallyOnProfileRequest(boolean ask4ProfilesAutomaticallyOnProfileRequest) {

    }

    @Override
    public boolean getAst4ProfilesAutomaticallyOnProfileRequest() {
        return false;
    }

    @Override
    public void setAsk4ProfilesAutomaticallyOnProfileReception(boolean ask4ProfilesAutomaticallyOnProfileReception) {

    }

    @Override
    public boolean getAst4ProfilesAutomaticallyOnProfileReception() {
        return false;
    }

    @Override
    public void setAcceptProfileWithDifferentOwner(boolean acceptProfileWithDifferentOwner) {

    }

    @Override
    public boolean getAcceptProfileWithDifferentOwner() {
        return false;
    }
}
