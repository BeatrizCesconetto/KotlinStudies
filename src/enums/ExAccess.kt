package enums

/*
* EXERCÍCIO
* ---------
*
* Crie 2 enums: Role (user, moderator, admin) e Level (basic, medium, high). Cada role deve ter um level associado
* e um métodos chamado canDelete(), que deve retornar um booleano indicando se o Role tem permissão de exclusão
* (apenas admins tem essa permissão)
*/

fun main () {

}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODERATOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete() = this == ADMIN //retorna true se for o admin
}

enum class Level {
    BASIC,
    MEDIUM,
    HIGH
}