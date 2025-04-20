package com.xworkz.inheritancemodule.vcs;

public class Git extends VCS
{
    @Override
    public void maintainProjects()
    {
        System.out.println("Git is used to maintain projects");
    }
    @Override
    public void initializeRepo() {
        System.out.println("Initializing a git repository");
    }
    @Override
    public void commitChanges() {
        System.out.println("Committing changes to the git repository");
    }
    @Override
    public void trackVersions() {
        System.out.println("Tracking different versions of the project files using git");
    }
    @Override
    public void mergeBranches() {
        System.out.println("Merging changes from different branches in git");
    }
    @Override
    public void rollbackChanges() {
        System.out.println("Rolling back changes to a previous version in git");
    }
    public void createBranch() {
        System.out.println("Creating a new branch for feature development in Git");
    }

    public void cloneRepo() {
        System.out.println("Cloning a remote repository to your local system using Git");
    }

    public void pushChanges() {
        System.out.println("Pushing local changes to the remote repository on Git");
    }

    public void pullChanges() {
        System.out.println("Pulling the latest changes from the remote repository.");
    }

    public void manageRemotes() {
        System.out.println("Managing remote repositories (e.g., GitHub, GitLab) in Git.");
    }
}
