package personal

class Likes {

    String type

    static belongsTo = [post: Post]

    static constraints = {
        type blank: true, nullable: true
    }
}
