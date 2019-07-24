# About
SuperMod is a model-driven revision and variation control system that supports collaborative model-driven and/or software product line engineering based on the Eclipse Modeling Framework (EMF).

The tool was originally developed by Felix Schwägerl in the context of his Ph.D. thesis (Version Control and Product Lines in Model-Driven Software Engineering, University of Bayreuth, 2018) and then released publicly under the EPL.

Always keep in mind that SuperMod is an academic prototype. Some important VCS features such as user authentication, revision browsing, cherry-picking etc. are missing.

# Quick Tool Introduction
You can find the official project website here: [http://www.ai1.uni-bayreuth.de/en/projects/SuperMod/](http://www.ai1.uni-bayreuth.de/en/projects/SuperMod/)

A five-minute tool demo video is provided here: [https://www.youtube.com/watch?v=5XOk3x5kjFc](https://www.youtube.com/watch?v=5XOk3x5kjFc)

# Installation Instructions
SuperMod consists of a mandatory client-side application and an optional server-side application, which is only required for multi-user operation.

## Client-Side
The client-side is provided as Eclipse plugin here: [https://github.com/se-ubt/supermod/raw/master/update/](https://github.com/se-ubt/supermod/raw/master/update/)

Without any further dependencies, these plug-ins can be installed, e.g., into a clean [Eclipse Oxygen (Modeling Edition)](http://www.eclipse.org/downloads/packages/release/Oxygen) distribution.

For first experiments, we recommend to install only the "SuperMod Core" and "SuperMod Revision+Feature Layered Version Model" plug-ins.

SuperMod is integrated into the "Team" context menu in the Eclipse package explorer. After installation, you can put an arbitrary Eclipse project under SuperMod version control via Team -> Share Project.

## Server-Side
The server-side has been implemented as Apache Tomcat 7 webservice. We offer a pre-compiled servlet (WAR archive) here:
[https://github.com/se-ubt/supermod/raw/master/artifacts/supermod-server.war](https://github.com/se-ubt/supermod/raw/master/artifacts/supermod-server.war)

Depending on the location where your Tomcat host runs, the SuperMod repository URLs would look as follows:
http://my-server.foo/supermod-server/repos/my-repo

# Publications
Below, a selection of scientific publications where the concepts underlying SuperMod are explained:
<ul type="circle">
<li>Felix Schwägerl: <br><strong><a href="https://epub.uni-bayreuth.de/3554/" target="_blank">Version Control and Product Lines in Model-Driven Software Engineering</a></strong><br>Universität Bayreuth, 2018.</li>
<li>Felix Schwägerl and Bernhard Westfechtel: <br><strong><a href="http://dx.doi.org/10.5220/0006071800150028" target="_blank">Maintaining Workspace Consistency in Filtered Editing of Dynamically Evolving Model-driven Software Product Lines</a></strong><br>in: Proceedings of the 5th International Conference on Model-Driven Engineering and Software Development (MODELSWARD 2017).<br>Porto, Portugal, 19 - 21 February 2017, SCITEPRESS Science and Technology Publications, Portugal, p. 15-28.</li>
<li>Felix Schwägerl and Bernhard Westfechtel: <br><strong><a href="http://doi.acm.org/10.1145/3023956.3023969" target="_blank">Perspectives on Combining Model-driven Engineering, Software Product Line Engineering, and Version Control</a></strong><br>in: Proceedings of the Eleventh International Workshop on Variability Modelling of Software-intensive Systems (VaMoS 2017).<br>Eindhoven, Netherlands, February 2017, ACM, p. 76-83.</li>
<li>Felix Schwägerl and Bernhard Westfechtel: <br><strong><a href="http://dx.doi.org/10.1145/2970276.2970288" target="_blank">SuperMod: Tool Support for Collaborative Filtered Model-Driven Software Product Line Engineering</a></strong><br>in: Proceedings of the 31st IEEE/ACM International Conference on Automated Software Engineering (ASE 2016). <br> David Lo, Sven Apel and Sarfraz Khurshid (Eds.)<br>Singapore, September 2016, ACM, p. 822-827.</li>
<li>Felix Schwägerl and Bernhard Westfechtel: <br><strong><a href="http://dx.doi.org/10.5220/0005971300830094" target="_blank">Collaborative and Distributed Management of Versioned Model-driven Software Product Lines</a></strong><br>in: Proceedings of the 11th International Conference on Software Paradigm Trends (ICSOFT-PT 2016). <br> Leszek Maciaszek, Jorge Cardoso, André Ludwig, Marten van Sinderen and Enrique Cabello (Eds.)<br>Lisbon, Portugal, July 2016, SCITEPRESS Science and Technology Publications, Portugal, p. 83-94.</li>
<li>Felix Schwägerl, Thomas Buchmann and Bernhard Westfechtel: <br><strong><a href="http://link.springer.com/chapter/10.1007/978-3-319-30142-6_2" target="_blank">Filtered Model-Driven Product Line Engineering with SuperMod: The Home Automation Case</a></strong><br> in: Communications in Computer and Information Science (CCIS), Volume 586.<br> Pascal Lorenz, Jorge Cardoso, Leszek A. Maciaszek, Marten van Sinderen (Eds.)<br>Revised Selected Papers from ICSOFT-PT 2015, Springer, p. 19-41.</li>
<li>Felix Schwägerl, Thomas Buchmann, Sabrina Uhrig and Bernhard Westfechtel: <br><strong><a href="http://link.springer.com/chapter/10.1007/978-3-319-27869-8_2" target="_blank"> Realizing a Conceptual Framework to Integrate Model-Driven Engineering, Software Product Line Engineering, and Software Configuration Management</a></strong><br> in: Communications in Computer and Information Science (CCIS), Volume 580.<br> Philippe Desfray, Joaquim Filipe, Slimane Hammoudi, Luís Ferreira Pires (Eds.)<br> Revised Selected Papers from MODELSWARD 2015, Springer, p. 21-44.</li>
<li>Felix Schwägerl, Thomas Buchmann and Bernhard Westfechtel: <br><strong><a href="http://dx.doi.org/10.5220/0005506600050018" target="_blank">SuperMod - A Model-Driven Tool that Combines Version Control and Software Product Line Engineering</a></strong><br>in: Proceedings of the 10th International Conference on Software Paradigm Trends (ICSOFT-PT 2015). Pascal Lorenz, Marten van Sinderen and Jorge Cardoso (Eds.)<br> Colmar, Alsace, France, July 2015, SCITEPRESS Science and Technology Publications, p. 5-18.</li>
<li>Felix Schwägerl, Thomas Buchmann, Sabrina Uhrig and Bernhard Westfechtel:<br><strong><a href="http://dx.doi.org/10.5220/0005195000050018" target="_blank">Towards the Integration of Model-Driven Engineering, Software Product Line Engineering, and Software Configuration Management</a></strong><br>in: Proceedings of the 3rd International Conference on Model-Driven Engineering and Software Development (MODELSWARD 2015). Slimane Hammoudi, Luis Ferreira Pires, Philppe Desfray and Joaquim Filipe (Eds.), ESEO, Angers, Loire Valley, France, 9 - 11 February 2015, SCITEPRESS Science and Technology Publications, Portugal, p. 5-18.</li>
</ul>
