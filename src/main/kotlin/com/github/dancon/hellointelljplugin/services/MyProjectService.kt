package com.github.dancon.hellointelljplugin.services

import com.github.dancon.hellointelljplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
