def profileName = getFieldById("customfield_25487")
def userTypeID =  getFieldById("customfield_25495")
def parentDB = getFieldById("customfield_25488")
def roleName = getFieldById("customfield_25398")
def serviceAccountName = getFieldById("customfield_25481")
def flag = getFieldById("customfield_25391").getValue().toString()
def userType = userTypeID.getValue().toString()
if(flag =="Writable" ||flag == "Show"){
    userTypeID.setHidden(true) 
}
if(userType == 'Existing' && flag =="Writable"){
    profileName.setHidden(true) 
    parentDB.setHidden(true) 
    serviceAccountName.setHidden(true)
    roleName.setHidden(true)
}
else if(userType == 'Existing' && flag =="Show"){ 
    profileName.setHidden(true) 
    parentDB.setHidden(true) 
    serviceAccountName.setHidden(true)
    roleName.setHidden(false)
}

else if(userType == 'New' && flag =="Writable"){ 
    profileName.setHidden(true) 
    parentDB.setHidden(true) 
    serviceAccountName.setHidden(true)
    roleName.setHidden(true)
}
else if(userType == 'New' && flag =="Show"){ 
    profileName.setHidden(false) 
    parentDB.setHidden(false) 
    serviceAccountName.setHidden(false)
    roleName.setHidden(false)
}

def description = getFieldById("customfield_19452") 
description.setFormValue("IMPORTANT NOTE: Access Provisioning will commence upon clicking Begin Provisioning button and completion time could vary.If this page times-out, please close it and check the status of Access Request after/every 15 minutes.")