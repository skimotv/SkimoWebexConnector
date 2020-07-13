# Overview
## SkimoWebexConnector
This repository has the connector to connect to the Cisco Webex conference service provider.

The connector extends the SkimoConnectorTemplate, which utilizes Springboot and Thymeleaf

(refer to the template README for more info)

The connector uses the Cisco Webex REST API to obtain data.

Visit the [Skimo Website](https://skimo.tv/) to test functionality. 

## Functional Capabilities
**FULL ELABORATION FOR FUNCTIONS LISTED IN NEXT SECTION**

Allow users to login to Cisco Webex account using OAuth 2.0

Retrieve a list of rooms that the user is a member of

Retrieve a list of items in the selected room's drive 

Retrieve a list of meetings from the items in the drive

Display a list of Webex meetings on the Skimo website for the user

Allow user to select a recording and upload recording to the Skimo server

# Specific Functions 
For each function - summarize step by step how the function works at a user level (UI inputs outputs)
                  
                  - summarize the code used to achieve said functionality 
## Webex login using OAuth 2.0
Must use a Webex account backed by Cisco Webex Common Identity (CI)

## Retrieving List of Joined Teams  
Use GET https://webexapis.com/v1/teams : Lists teams to which the authenticated user belongs
## Retrieving Team Details 
Use GET https://webexapis.com/v1/teams/{teamId} : Shows details for a team, by ID. Specify the team ID in the teamId parameter in the URI.
## Retrieving List of Team Memberships
Use GET https://webexapis.com/v1/team/memberships : Lists all team memberships for a given team, specified by the teamId query parameter. Use query parameters to filter the response.
## Retrieve List of Recordings 
Use GET https://webexapis.com/v1/recordings : Lists recordings. You can specify a date range and the maximum number of recordings to return. Only recordings of meetings hosted by or shared with the authenticated user will be listed. The list returned is sorted in descending order by the date and time that the recordings were created. Long result sets are split into pages.
## Display List of Calls in Skimo

## Rooms Call Select and Upload 

# Source
https://developer.webex.com/docs/api/getting-started

# Contributing and Support
We'd love that you contribute to the project. Before doing so, please contact jessicabhalerao@gmail.com for more info. 
