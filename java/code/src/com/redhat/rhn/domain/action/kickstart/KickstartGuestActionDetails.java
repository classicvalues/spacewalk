/**
 * Copyright (c) 2009 Red Hat, Inc.
 *
 * This software is licensed to you under the GNU General Public License,
 * version 2 (GPLv2). There is NO WARRANTY for this software, express or
 * implied, including the implied warranties of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
 * along with this software; if not, see
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
 *
 * Red Hat trademarks are not licensed under GPLv2. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation.
 */
package com.redhat.rhn.domain.action.kickstart;


/**
 * KickstartGuestActionDetails - java representation of the rhnActionKickstart table
 * @version $Rev$
 */
public class KickstartGuestActionDetails extends BaseKickstartActionDetails {

    private Long kickstartSessionId;
    private String guestName;
    private Long memKb;
    private Long vcpus;
    private Long diskGb;
    private String virtBridge;
    private String diskPath;
    
    


    /**
     * Returns the kickstart session ID.
     * @return The kickstart session ID.
     */
    public Long getKickstartSessionId() {
        return this.kickstartSessionId;
    }

    /**
     * Sets the kickstart session ID.
     * @param ksSessionIdIn The kickstart session ID to set.
     */
    public void setKickstartSessionId(Long ksSessionIdIn) {
        this.kickstartSessionId = ksSessionIdIn;
    }
    
    /**
     * @return Returns the guestName
     */
    public String getGuestName() {
        return this.guestName;
    }

    /**
     * @param guestNameIn the guestName to set.
     */
    public void setGuestName(String guestNameIn) {
        this.guestName = guestNameIn;
    }

    /**
     * @return Returns the memKb
     */
    public Long getMemKb() {
        return memKb;
    }

    /**
     * @param memKbIn the memKb to set.
     */
    public void setMemKb(Long memKbIn) {
        this.memKb = memKbIn;
    }

    /**
     * @return Returns the vcpus
     */
    public Long getVcpus() {
        return vcpus;
    }

    /**
     * @param vcpusIn the vcpus to set.
     */
    public void setVcpus(Long vcpusIn) {
        this.vcpus = vcpusIn;
    }

    /**
     * @return Returns the diskGb
     */
    public Long getDiskGb() {
        return diskGb;
    }

    /**
     * @param diskGbIn the diskGb to set.
     */
    public void setDiskGb(Long diskGbIn) {
        this.diskGb = diskGbIn;
    }
    
    /**
     * @return Returns the virtBridge.
     */
    public String getVirtBridge() {
        return virtBridge;
    }

    
    /**
     * @param virtBridgeIn The virtBridge to set.
     */
    public void setVirtBridge(String virtBridgeIn) {
        this.virtBridge = virtBridgeIn;
    }

    
    /**
     * @return Returns the diskPath.
     */
    public String getDiskPath() {
        return diskPath;
    }

    
    /**
     * @param diskPathIn The diskPath to set.
     */
    public void setDiskPath(String diskPathIn) {
        this.diskPath = diskPathIn;
    }

    
}
