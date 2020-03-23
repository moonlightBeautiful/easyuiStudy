package com.ims.c08sample.model

class User {

    var id: Int = 0
    var name: String? = null
    var phone: String? = null
    var email: String? = null
    var qq: String? = null

    constructor() {}

    constructor(name: String, phone: String, email: String, qq: String) {
        this.name = name
        this.phone = phone
        this.email = email
        this.qq = qq
    }


}
