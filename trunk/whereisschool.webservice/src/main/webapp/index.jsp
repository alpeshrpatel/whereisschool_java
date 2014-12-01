<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
  	<!-- Load jQuery from Google's CDN -->
  	<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
  	<link href="<c:url value="/resources/whereisschool.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/script.js" />"></script>
  </head>
  <body>


	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	<!-- Brand and toggle get grouped for better mobile display -->
	<div class="limit-width-1200">
		<div class="navbar-header">
		
			<div class="fl pam">
				<a href="http://www.greatschools.org/"><img
					alt="GreatSchools.org" height="35"
					src="http://www.gscdn.org/assets/nav/GS_logo_2x-new-73cb6f8038067c7c0a138828bfb2e706.png"
					width="150" /></a>
			</div>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-ex1-collapse topnav-float">
			<ul class="nav navbar-nav">
				<li>
					<ul class="dropdown-menu">
					</ul>
				</li>
				<li><a id="searchschool" href="./jsp/search-school.jsp">
						Search School
					</a>
				</li>
				<li><a class="js-no_ad" href="/school/parentReview.page"
					onclick="GS.omniture.track_reviews(&#39;GlobalNav&#39;);">Review
						Your School</a></li>
				<li><a class="dropdown-toggle" data-toggle="dropdown"
					href="#back-to-school">Discover <span class="caret"></span>
				</a>
					<ul class="dropdown-menu">
						<li class=" "><a
							href="http://www.greatschools.org/worksheets-activities.topic?content=4313">Worksheets
								&amp; Activities</a></li>
						<li class=" "><a
							href="http://www.greatschools.org/healthy-kids.topic?content=2504">Health
								&amp; Wellness</a></li>
						<li><a
							href="http://www.greatschools.org/parenting-dilemmas.topic?content=4321">Parenting
								Dilemmas</a></li>
						<li><a href="http://www.greatschools.org/college/">Road
								to College</a></li>
						<li class=" "><a
							href="http://www.greatschools.org/STEM.topic?content=8021">STEM</a>
						</li>
						<li><a
							href="http://www.greatschools.org/special-education.topic?content=1541">Learning
								Difficulties</a></li>
						<li class=" "><a
							href="http://www.greatschools.org/understanding-common-core-state-standards.topic?content=7802">Common
								Core</a></li>
					</ul></li>

				<li><a class="brand-secondary js-no_ad"
					href="http://www.greatschools.org/gsr/login/">Sign In</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	</nav>
	<div class="grey-bg pr">
		<div class="proto-image-bg-scale proto_hero_size oh">
			<div class="img-container is-scaled">
				<!--not empty-->
			</div>
		</div>
		<div class="limit-width-1200">
			<div class="absolute-center">
				<div class="row">
					<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
						<div class="oa content-centered tac text_fff ">
							<h1 class="jumbo-header ts text_fff">Welcome to whereisschools</h1>
							<div class="subtitle-lg ts">The place to find
								and share information about your schools</div>
						</div>
						<div class="search-bar-home ma ptl">

							<div class="row ptm">
								<form name="schoolResultsSearchForm"
									class="js-schoolResultsSearchForm" action="/search/search.page"
									method="get">
									<div class="col-xs-9 prm mbm">
										<input type="text" name="locationSearchString" value=""
											data-prev-search="" id="js-schoolResultsSearch"
											class='typeahead search-text full-width pam js-forceLocationSearch'
											placeholder=""> <label
											class="dn js-mobile-placeholder js-translate-placeholder"></label>
									</div>

									<div class="hidden-xs col-sm-3 phm mbm">
										<button type='submit'
											class=" pull-right btn btn-lg btn-primary">Search</button>
									</div>

									<div class="visible-xs col-xs-3 phm mbm">
									
									</div>
								</form>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>