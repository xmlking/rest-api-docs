package rest.api.docs

class User {

    String username
    String lastname
    String firstname
    String email
    Integer age

    static constraints = {
        email email: true
        lastname nullable: true
        firstname nullable: true
        age nullable: true, min: 13
    }

}