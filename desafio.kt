// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DANASA }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg novoUsuario: Usuario) {
        for (usuario in novoUsuario) {
            inscritos.add(usuario)
            println("${usuario.nome} foi matriculado")
        }
   fun matricularComFuncaoDeEscopoAlso(usuario: Usuario) {
       usuario.also {
           inscritos.add(it)
           println("${it.nome} foi matriculado")
       }
   }
       
    }
}

fun main() {
    val f = Formacao("android", listOf(), Nivel.BASICO)
    val user1 = Usuario("Hyu")
    val user2 = Usuario("Ana")
    
    f.matricular(user1,user2)
}
