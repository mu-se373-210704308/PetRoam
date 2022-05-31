package tr.edu.maltepe.project.petroam

class User {
    var id:String? = null
    var fullname:String? = null
    var username:String? = null
    var email:String? = null
    var password:String? = null

    override fun toString(): String {
        return "User(id=$id, fullname=$fullname, username=$username, email=$email, password=$password)"    }
}