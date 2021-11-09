package dev.alexfog

import java.io.File

private val mapsDir = File("src\\main\\resources\\maps")

fun mainMap(): File? = mapsDir.walk().maxDepth(1)
    .filter { it.isFile }
    .firstOrNull()

fun map(name: String): File? = mapsDir.walk()
    .filter { it.name.equals(name) }
    .firstOrNull()

fun mapPath(map: File): String = map.path
    .substringAfter("src\\main\\resources\\")
    .replace("\\", "/")