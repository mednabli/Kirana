<%@ include file="../layout/taglib.jsp"%>


<div class="body">
	<form:form id="user-form" class="form-horizontal form-label-left"
		method="post" modelAttribute="product" action="productForm/addProduct">

		<fieldset>
			<legend class="section">New Product</legend>
			<div class="form-group">
				<label class="control-label col-sm-4" for="prefix">product
					name<span class="required">*</span>
				</label>
				<div class="col-sm-8">
					<form:input type="text" path="name" required="required"
						class="form-control input-transparent"></form:input>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="last-name">Category
					<span class="required">*</span>
				</label>
				<div class="col-sm-8">
					<input type="text" required="required"
						class="form-control input-transparent">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-4" for="elastic-textarea">
					Description<span class="required">*</span>
				</label>
				<div class="col-sm-8">
					<form:textarea rows="3"
						class="autogrow form-control transition-height input-transparent"
						path="description"
						style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 118px;"></form:textarea>
				</div>
			</div>

		</fieldset>

		<fieldset>
			<legend class="section">Media</legend>
			<div class="control-label col-sm-4">some description will be
				written here for files to upload</div>
			<div class="col-sm-8">
				<section class="widget">
					<div class="body">
						<div class="form-actions fileupload-buttonbar no-margin">
							<span class="btn btn-default fileinput-button mr-xs"> <i
								class="glyphicon glyphicon-plus"></i> <span>Add files...</span>
								<input type="file" name="files[]" multiple="multiple" size="10">
							</span>
						</div>
					</div>
						<div class="row">

							<ol class="list-group list-group-outer sortable list-group-sortable ui-sortable">

								<li class="list-group-item ui-sortable-handle" style="position: relative; left: 0px; top: 0px;">
									<i class="fa fa-sort"></i>
									<a class="close" data-dismiss="alert" href="#" aria-hidden="true">×</a>
								01 File 1</li>
								
								<li class="list-group-item ui-sortable-handle" style="position: relative; left: 0px; top: 0px;">
									<i class="fa fa-sort"></i>
									<a class="close" data-dismiss="alert" href="#" aria-hidden="true">×</a>
								01 File 1</li>
							</ol>
						</div>
				</section>
			</div>

		</fieldset>

		<div class="form-actions">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-4 text-right">
					<button type="submit" class="btn btn-primary">Add Product</button>
					<button type="button" class="btn btn-default">Cancel</button>
				</div>
			</div>
		</div>
	</form:form>
</div>



