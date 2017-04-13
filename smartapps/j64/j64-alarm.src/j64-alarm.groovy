definition(
	name: "j64 Alarm",
	namespace: "j64",
	author: "Joe Jarvis",
	description: "Integrate your Envisalink/DSC alarm system with SmartThings using the j64 Alarm Server. This integration allows you to incorporate and control your existing motion sensors, contact sensors and alarms from the SmartThings Hub.",
	category: "SmartThings Labs",
        iconUrl: "http://cdn.device-icons.smartthings.com/Home/home3-icn.png",
        iconX2Url: "http://cdn.device-icons.smartthings.com/Home/home3-icn@2x.png",
        iconX3Url: "http://cdn.device-icons.smartthings.com/Home/home3-icn@3x.png"
)

mappings {
    /* installDevices is called by the j64 Alarm Server and passes information about
       the various partitions and zones that are defined in your security system.  No
       security or arming codes are transmitted into or stored by this service */
    path("/installDevices") {
        action: [
            POST: "installDevices",
        ]
    }
    
    /* UpdatePartition is called by the j64 Alarm Server when the status of the
       partition has changed.  This information is then propogated to the various
       child devices so it can be reflected in the mobile app  */
    path("/UpdatePartition") {
        action: [
            POST: "updatePartition"
        ]
    }
    
    /* UpdateZone is called by the j64 Alarm Server when the status of a zone 
       has changed.  This information is then propogated to the various child
       devices so it can be reflected in the mobile app */
    path("/UpdateZone") {
        action: [
            POST: "updateZone"
        ]
    }
}