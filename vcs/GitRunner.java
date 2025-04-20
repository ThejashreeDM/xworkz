package com.xworkz.inheritancemodule.vcs;

public class GitRunner
{
    public static void main(String[] args) {
        VCS vcs = new VCS();
        VCS gitAsVCS = new Git();
        Git git = new Git();
        vcs.maintainProjects();
        vcs.initializeRepo();
        vcs.commitChanges();
        vcs.trackVersions();
        vcs.mergeBranches();
        vcs.rollbackChanges();
        gitAsVCS.maintainProjects();
        gitAsVCS.initializeRepo();
        gitAsVCS.commitChanges();
        gitAsVCS.trackVersions();
        gitAsVCS.mergeBranches();
        gitAsVCS.rollbackChanges();
        git.maintainProjects();
        git.initializeRepo();
        git.commitChanges();
        git.trackVersions();
        git.mergeBranches();
        git.rollbackChanges();
        git.createBranch();
        git.cloneRepo();
        git.pushChanges();
        git.pullChanges();
        git.manageRemotes();
    }
}
