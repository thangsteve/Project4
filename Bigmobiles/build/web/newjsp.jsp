<!DOCTYPE html><html lang="en" class=" "><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Gentelella Alela! | </title>

        <!-- Bootstrap -->
        <link href="vendorsbootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Font Awesome -->
        <link href="vendors/font-awesome.min.css" rel="stylesheet">
        <!-- NProgress -->
        <link href="vendors/nprogress.css" rel="stylesheet">
        <!-- iCheck -->
        <link href="vendors/green.css" rel="stylesheet">
        <!-- bootstrap-wysiwyg -->
        <link href="vendors/prettify.min.css" rel="stylesheet">
        <!-- Select2 -->
        <link href="vendors/select2.min.css" rel="stylesheet">
        <!-- Switchery -->
        <link href="vendors/switchery.min.css" rel="stylesheet">
        <!-- starrr -->
        <link href="vendors/starrr.css" rel="stylesheet">
        <!-- bootstrap-daterangepicker -->
        <link href="vendors/daterangepicker.css" rel="stylesheet">

        <!-- Custom Theme Style -->
        <link href="vendors/custom.min.css" rel="stylesheet">
    </head>

    <body class="nav-md">
        <div class="container body">
            <div class="main_container col-lg-11">
                <!-- top navigation -->
                <div class="top_nav"> </div>
                <!-- /top navigation -->

                <!-- page content -->
                <div class="right_col" role="main">
                    <div class="">
                        <div class="clearfix"></div>
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_content">
                                    <div class="btn-toolbar editor" data-role="editor-toolbar" data-target="#editor-one">
                                        <div class="btn-group">                </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Text areas<small>Sessions</small></h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                <div id="alerts"></div>
                                <div class="btn-toolbar editor" data-role="editor-toolbar" data-target="#editor-one">
                                    <div class="btn-group"> <a title="Font" class="btn dropdown-toggle" data-toggle="dropdown"><i class="fa fa-font"></i><b class="caret"></b></a>
                                        <ul class="dropdown-menu">
                                        </ul>
                                    </div>
                                    <div class="btn-group"> <a title="Font Size" class="btn dropdown-toggle" data-toggle="dropdown"><i class="fa fa-text-height"></i>&nbsp;<b class="caret"></b></a>
                                        <ul class="dropdown-menu">
                                            <li> <a data-edit="fontSize 5">
                                                    <p style="font-size:17px">Huge</p>
                                                </a> </li>
                                            <li> <a data-edit="fontSize 3">
                                                    <p style="font-size:14px">Normal</p>
                                                </a> </li>
                                            <li> <a data-edit="fontSize 1">
                                                    <p style="font-size:11px">Small</p>
                                                </a> </li>
                                        </ul>
                                    </div>
                                    <div class="btn-group"> <a title="Bold (Ctrl/Cmd+B)" class="btn" data-edit="bold"><i class="fa fa-bold"></i></a> <a title="Italic (Ctrl/Cmd+I)" class="btn" data-edit="italic"><i class="fa fa-italic"></i></a> <a title="Strikethrough" class="btn" data-edit="strikethrough"><i class="fa fa-strikethrough"></i></a> <a title="Underline (Ctrl/Cmd+U)" class="btn" data-edit="underline"><i class="fa fa-underline"></i></a> </div>
                                    <div class="btn-group"> <a title="Bullet list" class="btn" data-edit="insertunorderedlist"><i class="fa fa-list-ul"></i></a> <a title="Number list" class="btn" data-edit="insertorderedlist"><i class="fa fa-list-ol"></i></a> <a title="Reduce indent (Shift+Tab)" class="btn" data-edit="outdent"><i class="fa fa-dedent"></i></a> <a title="Indent (Tab)" class="btn" data-edit="indent"><i class="fa fa-indent"></i></a> </div>
                                    <div class="btn-group"> <a title="Align Left (Ctrl/Cmd+L)" class="btn" data-edit="justifyleft"><i class="fa fa-align-left"></i></a> <a title="Center (Ctrl/Cmd+E)" class="btn" data-edit="justifycenter"><i class="fa fa-align-center"></i></a> <a title="Align Right (Ctrl/Cmd+R)" class="btn" data-edit="justifyright"><i class="fa fa-align-right"></i></a> <a title="Justify (Ctrl/Cmd+J)" class="btn" data-edit="justifyfull"><i class="fa fa-align-justify"></i></a> </div>
                                    <div class="btn-group"> <a title="Hyperlink" class="btn dropdown-toggle" data-toggle="dropdown"><i class="fa fa-link"></i></a>
                                        <div class="dropdown-menu input-append">
                                            <input class="span2" placeholder="URL" type="text" data-edit="createLink">
                                            <button type="button" class="btn">Add</button>
                                        </div>
                                        <a title="Remove Hyperlink" class="btn" data-edit="unlink"><i class="fa fa-cut"></i></a> </div>
                                    <div class="btn-group"> <a class="btn" title="Insert picture (or just drag &amp; drop)" id="pictureBtn"><i class="fa fa-picture-o"></i></a>
                                        <input type="file" data-role="magic-overlay" accept=".png,.jpg" data-target="#pictureBtn" data-edit="insertImage">
                                    </div>
                                    <div class="btn-group"> <a title="Undo (Ctrl/Cmd+Z)" class="btn" data-edit="undo"><i class="fa fa-undo"></i></a> <a title="Redo (Ctrl/Cmd+Y)" class="btn" data-edit="redo"><i class="fa fa-repeat"></i></a> </div>
                                </div>
                                <div class="editor-wrapper" id="editor-one"></div>
                                <textarea name="descr" id="descr" style="display:none;"></textarea>
                                <input type="submit">
                                <br>
                                <div class="ln_solid"></div>
                            </div>
                            <div class="x_content"> </div>
                        </div>

                    </div>
                </div>
                <!-- /page content -->

                <!-- footer content -->
                <footer>
                    <div class="clearfix"></div>
                </footer>
                <!-- /footer content -->
            </div>
        </div>

        <!-- jQuery -->
        <script src="vendors/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="vendors/bootstrap.min.js"></script>
        <!-- FastClick -->
        <script src="vendors/fastclick.js"></script>
        <!-- NProgress -->
        <script src="vendors/nprogress.js"></script>
        <!-- bootstrap-progressbar -->
        <script src="vendors/bootstrap-progressbar.min.js"></script>
        <!-- iCheck -->
        <script src="vendors/icheck.min.js"></script>
        <!-- bootstrap-daterangepicker -->
        <script src="vendors/moment.min.js"></script>
        <script src="vendors/daterangepicker.js"></script>
        <!-- bootstrap-wysiwyg -->
        <script src="vendors/bootstrap-wysiwyg.min.js"></script>
        <script src="vendors/jquery.hotkeys.js"></script>
        <script src="vendors/prettify.js"></script>
        <!-- jQuery Tags Input -->
        <script src="vendors/jquery.tagsinput.js"></script>
        <!-- Switchery -->
        <script src="vendors/switchery.min.js"></script>
        <!-- Select2 -->
        <script src="vendors/select2.full.min.js"></script>
        <!-- Parsley -->
        <script src="vendors/parsley.min.js"></script>
        <!-- Autosize -->
        <script src="vendors/autosize.min.js"></script>
        <!-- jQuery autocomplete -->
        <script src="vendors/jquery.autocomplete.min.js"></script>
        <!-- starrr -->
        <script src="vendors/starrr.js"></script>
        <!-- Custom Theme Scripts -->
        <script src="vendors/custom.min.js"></script>



    </body></html>
