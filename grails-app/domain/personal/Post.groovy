package personal

class Post {

    String content

    static hasMany = [like:Likes]

    static constraints = {
        content nullable: true, blank: true
        like nullable: true, blank: true
    }
}
