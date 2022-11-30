//package com.example.demo.Evaluation;
//
//
////import lombok.Data;
//
//import javax.persistence.*;
//
//@Entity
//@Table
////@Data
//public class Evaluation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private long id;
//    private double newKnowLedge;
//    private double planTasks;
//    private double skills;
//    private double achievement;
//    private double motivation;
//    private double outcomes;
//    private double backgroundResearch;
//    private double functionalRequirements;
//    private double constraints;
//    private double solutions;
//    private double improvements;
//    private double results;
//    private double conclusion;
//    private double communicationSkills;
//    private double slidesQuality;
//    private double problemFormulation;
//    private double standards;
//    private double impact;
//    private double writtenCommunication;
//    private double scientificReferencing;
//    private double projectObjectives;
//    private double recentDevelopment;
//    private double solutionSpec;
//    private double futureWorkPlan;
//    private double oralExpression;
//    private double meetingManagement;
//    private double proposalReport;
//    private double progressReport;
//    private double implementationProgress;
//
//    public Evaluation(double newKnowLedge, double planTasks, double skills, double achievement, double motivation, double outcomes, double backgroundResearch, double functionalRequirements, double constraints, double solutions, double improvements, double results, double conclusion, double communicationSkills, double slidesQuality, double problemFormulation, double standards, double impact, double writtenCommunication, double scientificReferencing, double projectObjectives, double recentDevelopment, double solutionSpec, double futureWorkPlan, double oralExpression, double meetingManagement, double proposalReport, double progressReport, double implementationProgress) {
//        this.newKnowLedge = newKnowLedge;
//        this.planTasks = planTasks;
//        this.skills = skills;
//        this.achievement = achievement;
//        this.motivation = motivation;
//        this.outcomes = outcomes;
//        this.backgroundResearch = backgroundResearch;
//        this.functionalRequirements = functionalRequirements;
//        this.constraints = constraints;
//        this.solutions = solutions;
//        this.improvements = improvements;
//        this.results = results;
//        this.conclusion = conclusion;
//        this.communicationSkills = communicationSkills;
//        this.slidesQuality = slidesQuality;
//        this.problemFormulation = problemFormulation;
//        this.standards = standards;
//        this.impact = impact;
//        this.writtenCommunication = writtenCommunication;
//        this.scientificReferencing = scientificReferencing;
//        this.projectObjectives = projectObjectives;
//        this.recentDevelopment = recentDevelopment;
//        this.solutionSpec = solutionSpec;
//        this.futureWorkPlan = futureWorkPlan;
//        this.oralExpression = oralExpression;
//        this.meetingManagement = meetingManagement;
//        this.proposalReport = proposalReport;
//        this.progressReport = progressReport;
//        this.implementationProgress = implementationProgress;
//    }
//
//    public Evaluation() {
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public double getNewKnowLedge() {
//        return newKnowLedge;
//    }
//
//    public void setNewKnowLedge(double newKnowLedge) {
//        this.newKnowLedge = newKnowLedge;
//    }
//
//    public double getPlanTasks() {
//        return planTasks;
//    }
//
//    public void setPlanTasks(double planTasks) {
//        this.planTasks = planTasks;
//    }
//
//    public double getSkills() {
//        return skills;
//    }
//
//    public void setSkills(double skills) {
//        this.skills = skills;
//    }
//
//    public double getAchievement() {
//        return achievement;
//    }
//
//    public void setAchievement(double achievement) {
//        this.achievement = achievement;
//    }
//
//    public double getMotivation() {
//        return motivation;
//    }
//
//    public void setMotivation(double motivation) {
//        this.motivation = motivation;
//    }
//
//    public double getOutcomes() {
//        return outcomes;
//    }
//
//    public void setOutcomes(double outcomes) {
//        this.outcomes = outcomes;
//    }
//
//    public double getBackgroundResearch() {
//        return backgroundResearch;
//    }
//
//    public void setBackgroundResearch(double backgroundResearch) {
//        this.backgroundResearch = backgroundResearch;
//    }
//
//    public double getFunctionalRequirements() {
//        return functionalRequirements;
//    }
//
//    public void setFunctionalRequirements(double functionalRequirements) {
//        this.functionalRequirements = functionalRequirements;
//    }
//
//    public double getConstraints() {
//        return constraints;
//    }
//
//    public void setConstraints(double constraints) {
//        this.constraints = constraints;
//    }
//
//    public double getSolutions() {
//        return solutions;
//    }
//
//    public void setSolutions(double solutions) {
//        this.solutions = solutions;
//    }
//
//    public double getImprovements() {
//        return improvements;
//    }
//
//    public void setImprovements(double improvements) {
//        this.improvements = improvements;
//    }
//
//    public double getResults() {
//        return results;
//    }
//
//    public void setResults(double results) {
//        this.results = results;
//    }
//
//    public double getConclusion() {
//        return conclusion;
//    }
//
//    public void setConclusion(double conclusion) {
//        this.conclusion = conclusion;
//    }
//
//    public double getCommunicationSkills() {
//        return communicationSkills;
//    }
//
//    public void setCommunicationSkills(double communicationSkills) {
//        this.communicationSkills = communicationSkills;
//    }
//
//    public double getSlidesQuality() {
//        return slidesQuality;
//    }
//
//    public void setSlidesQuality(double slidesQuality) {
//        this.slidesQuality = slidesQuality;
//    }
//
//    public double getProblemFormulation() {
//        return problemFormulation;
//    }
//
//    public void setProblemFormulation(double problemFormulation) {
//        this.problemFormulation = problemFormulation;
//    }
//
//    public double getStandards() {
//        return standards;
//    }
//
//    public void setStandards(double standards) {
//        this.standards = standards;
//    }
//
//    public double getImpact() {
//        return impact;
//    }
//
//    public void setImpact(double impact) {
//        this.impact = impact;
//    }
//
//    public double getWrittenCommunication() {
//        return writtenCommunication;
//    }
//
//    public void setWrittenCommunication(double writtenCommunication) {
//        this.writtenCommunication = writtenCommunication;
//    }
//
//    public double getScientificReferencing() {
//        return scientificReferencing;
//    }
//
//    public void setScientificReferencing(double scientificReferencing) {
//        this.scientificReferencing = scientificReferencing;
//    }
//
//    public double getProjectObjectives() {
//        return projectObjectives;
//    }
//
//    public void setProjectObjectives(double projectObjectives) {
//        this.projectObjectives = projectObjectives;
//    }
//
//    public double getRecentDevelopment() {
//        return recentDevelopment;
//    }
//
//    public void setRecentDevelopment(double recentDevelopment) {
//        this.recentDevelopment = recentDevelopment;
//    }
//
//    public double getSolutionSpec() {
//        return solutionSpec;
//    }
//
//    public void setSolutionSpec(double solutionSpec) {
//        this.solutionSpec = solutionSpec;
//    }
//
//    public double getFutureWorkPlan() {
//        return futureWorkPlan;
//    }
//
//    public void setFutureWorkPlan(double futureWorkPlan) {
//        this.futureWorkPlan = futureWorkPlan;
//    }
//
//    public double getOralExpression() {
//        return oralExpression;
//    }
//
//    public void setOralExpression(double oralExpression) {
//        this.oralExpression = oralExpression;
//    }
//
//    public double getMeetingManagement() {
//        return meetingManagement;
//    }
//
//    public void setMeetingManagement(double meetingManagement) {
//        this.meetingManagement = meetingManagement;
//    }
//
//    public double getProposalReport() {
//        return proposalReport;
//    }
//
//    public void setProposalReport(double proposalReport) {
//        this.proposalReport = proposalReport;
//    }
//
//    public double getProgressReport() {
//        return progressReport;
//    }
//
//    public void setProgressReport(double progressReport) {
//        this.progressReport = progressReport;
//    }
//
//    public double getImplementationProgress() {
//        return implementationProgress;
//    }
//
//    public void setImplementationProgress(double implementationProgress) {
//        this.implementationProgress = implementationProgress;
//    }
//}
