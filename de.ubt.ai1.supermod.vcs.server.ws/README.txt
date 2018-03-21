To build this project in Eclipse, you must have all SuperMod projects' source 
files (except for client projects) in your workspace. Then,
- Run an Ant build with WebContent/WEB-INF/export.xml.
  See the documentation in the export.xml file for more details.
  Wait until the workspace operation in background has completed.
- Run the Ant cleanup script: WebContent/WEB-INF/cleanup.xml
- Refresh WebContent using F5
- In the case of unresolved project dependencies, Project -> Clean -> All.
- Restart the server application manually, if running.