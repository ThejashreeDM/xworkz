package com.xworkz.inheritancemodule.vcs;

public class Git extends VCS
{
    public void createBranch() {
        System.out.println("Creating a new branch for feature development in Git.");
    }

    public void cloneRepo() {
        System.out.println("Cloning a remote repository to your local system using Git.");
    }

    public void pushChanges() {
        System.out.println("Pushing local changes to the remote repository on Git.");
    }

    public void pullChanges() {
        System.out.println("Pulling the latest changes from the remote repository.");
    }

    public void manageRemotes() {
        System.out.println("Managing remote repositories (e.g., GitHub, GitLab) in Git.");
    }
}
