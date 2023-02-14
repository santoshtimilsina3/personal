package personal

class Category {

    String type

    static belongsTo = [post:Post]

    static constraints = {
        type nullable: false, blank: false
    }
}
